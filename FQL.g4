/**
    A grammar for the Functorial Query Language (FQL)
    See http://categoricaldata.net/
 */
grammar FQL;

program: declaration+;

declaration:
      schemaDeclaration
    | instanceDeclaration
    | mappingDeclaration
    | enumDeclaration
    | fullQueryDeclaration
    | queryDeclaration
    | transDeclaration
    | dropDeclaration
    ;

schemaDeclaration:
    'schema' Identifier '=' schema
    ;

schema:
      'void'                                #SigExp_Zero
    | 'unit' schemaXXX                      #SigExp_One
    | opposite                              #SigExp_Opposite
    | plusType                              #SigExp_Plus
    | productType                           #SigExp_Times
    | exponentType                          #SigExp_Exp
    | unionType                             #SigExp_Union
    | Identifier                            #SigExp_Var
    | schemaConst                           #SigExp_Const
    ;
schemaXXX:
    '{' Identifier? (',' Identifier)* '}'
    ;
plusType:
    '(' schema '+' schema ')'
    ;
productType:
    '(' schema '*' schema ')'
    ;
exponentType:
    '(' schema '^' schema ')'
    ;
unionType:
    '(' schema 'union' schema ')'
    ;
schemaConst:
    '{' schemaComponents '}'
    ;
schemaComponents:
    schemaComponentsNodes
    schemaComponentsAttributes
    schemaComponentsArrows
    schemaComponentsEquations
    ;
schemaComponentsNodes: 'nodes' Identifier? (',' Identifier)* ';' ;

schemaComponentsAttributes:
      'attributes' arrow? (',' arrow)*  ';'
    | 'attributes' 'ASWRITTEN'? ';'
    ;
schemaComponentsArrows: 'arrows' arrow? (',' arrow)* ';' ;
arrow: Identifier ':' Identifier '->' Identifier ;
schemaComponentsEquations: 'equations' equation? (',' equation)* ';' ;
equation: path '=' path
    ;
opposite: 'opposite' schema ;

instanceDeclaration: 'instance' Identifier '=' instance ;
instance:
     'kernel' Identifier                    #InstExp_Kernel
    | 'prop' schema                         #InstExp_Two
    | 'void' schema                         #InstExp_Zero
    | 'unit' schema                         #InstExp_One
    | '(' instance '+' instance ')'         #InstExp_Plus
    | '(' instance '*' instance ')'         #InstExp_Times
    | '(' instance '^' instance ')'         #InstExp_Exp
    | Identifier                            #InstExp_      //UNSURE - HANDLE AS A STRING
    | instanceConstructor                   #InstExp_Const
    | instanceDelta                         #InstExp_Delta
    | instanceSigma                         #InstExp_Sigma
    | instancePi                            #InstExp_Pi
    | instanceFullSigma                     #InstExp_FullSigma
    | instanceExternal                      #InstExp_External
    | instanceRelationalize                 #InstExp_Relationalize
    | instanceEval                          #InstExp_Eval
    | instanceFullEval                      #InstExp_FullEval
    ;

instanceConstructor: '{' instanceConstXXX? (';' instanceConstXXX)* '}' ':' schema ;
instanceConstXXX: instanceConstNodes instanceConstAttributes instanceConstArrows ;
instanceConstNodes: 'nodes' instanceConstNode? (',' instanceConstNode)* ';' ;
instanceConstNode: Identifier '->' '{' value? (',' value)* '}' ;
instanceConstAttributes:
      ('attributes' instanceConstArrow? (',' instanceConstArrow)* ';' )
    | ('attributes' 'ASWRITTEN' ';')
    ;
instanceConstArrows: 'arrows' instanceConstArrow? (',' instanceConstArrow)* ';' ;
instanceConstArrow: Identifier '->' '{' instanceConstArrowStrings '}' ;
instanceConstArrowStrings: instanceConstArrowString? (',' instanceConstArrowString)* ;
instanceConstArrowString: '(' value ',' value ')' ;

instanceDelta: 'delta' mapping instance ;
instanceSigma: 'sigma' mapping instance ;
instancePi: 'pi' mapping instance ;
instanceFullSigma: 'SIGMA' mapping instance ;
instanceExternal: 'external' schema Identifier ;
instanceRelationalize: 'relationalize' Identifier ;
instanceEval: 'eval' query instance ;
instanceFullEval: 'EVAL' fullQuery instance ;

queryDeclaration: 'query' Identifier '=' query ;
query:
      queryP                                    # QueryExp_Const
    | queryComp                                 # QueryExp_Comp
    | Identifier                                # QueryExp_Var
    | queryMtch                                 # QueryExp_Mtch // NOT HANDLED in FQLParser.toQuery()
    ;
queryP: queryP1 queryP2 queryP3 ;
queryP1: 'delta' mapping ;
queryP2: 'pi' mapping ;
queryP3: 'sigma' mapping ;
queryComp: '(' query 'then' query ')' ;
queryMtch: 'match' queryXXX schema schema STRING ;
queryXXX: '{' queryYYY? (',' queryYYY)* '}' ;
queryYYY: '(' queryZZZ  ')' ;
queryZZZ: Identifier ',' Identifier ;

fullQueryDeclaration: 'QUERY' Identifier '=' fullQuery ;
fullQuery:
      'delta' mapping                           # FullQueryExp_Delta
    | 'pi' mapping                              # FullQueryExp_Pi
    | 'SIGMA' mapping                           # FullQueryExp_Sigma
    | '(' fullQuery 'then' fullQuery ')'        # FullQueryExp_Comp
    | Identifier                                # FullQueryExp_Var
    | fullQueryMatch                            # FullQueryExp_Match
    ;
fullQueryMatch: 'match' fullQueryXXX schema schema STRING ;
fullQueryXXX: '{' fullQueryYYY? (',' fullQueryYYY)* '}' ;
fullQueryYYY: '(' fullQueryZZZ  ')' ;
fullQueryZZZ: Identifier ',' Identifier ;

mappingDeclaration: 'mapping' Identifier '=' mapping ;
mapping:
      'unit' mappingXXX schema              #MapExp_TT
    | 'void' schema                         #MapExp_Void
    | 'iso1' schema schema                  #MapExp_Iso
    | 'iso2' schema schema                  #MapExp_Iso
    | 'fst'  schema schema                  #MapExp_Fst
    | 'snd'  schema schema                  #MapExp_Snd
    | 'inl'  schema schema                  #MapExp_Inl
    | 'inr'  schema schema                  #MapExp_Inr
    | 'eval' schema schema                  #MapExp_Apply
    | 'opposite' mapping                    #MapExp_Opposite
    | 'curry' mapping                       #MapExp_Curry
    | 'id' schema                           #MapExp_Id
    | 'subschema' schema schema             #MapExp_Sub
    | '(' mapping 'then' mapping ')'        #MapExp_Comp
    | '(' mapping '+' mapping ')'           #MapExp_Case
    | '(' mapping '*' mapping ')'           #MapExp_Prod
    | Identifier                            #MapExp_Var
    | mappingConstructor                    #MapExp_Const
    ;
mappingXXX: '{' Identifier? (',' Identifier)* '}' ;
mappingConstructor: '{' mappingConstXXX '}' ':' schema '->' schema ;
mappingConstXXX: mappingConstNodes mappingConstAttributes mappingConstArrows ;
mappingConstNodes: 'nodes' mappingNode? (',' mappingNode)* ';' ;
mappingConstAttributes: 'attributes' mappingNode? (',' mappingNode)* ';' ;
mappingConstArrows: 'arrows' mappingArrow? (',' mappingArrow)* ';' ;
mappingNode: Identifier '->' Identifier ;
mappingArrow: Identifier '->' path ;

enumDeclaration: 'enum' Identifier '=' '{' value (',' value)* '}' ;

transDeclaration: 'transform' Identifier '=' transform ;
transform:
      'external' Identifier Identifier Identifier   # TransExp_External
    | Identifier '.' 'char' Identifier              # TransExp_Chi
    | Identifier '.' 'kernel'                       # TransExp_UnChi
    | Identifier '.' 'unit' Identifier              # TransExp_TT
    | Identifier '.' 'void' Identifier              # TransExp_FF
    | Identifier '.' 'curry' Identifier             # TransExp_TransCurry
    | Identifier '.' 'fst'                          # TransExp_Fst
    | Identifier '.' 'not'                          # TransExp_Not
    | Identifier '.' 'and'                          # TransExp_And
    | Identifier '.' 'or'                           # TransExp_Or
    | Identifier '.' 'implies'                      # TransExp_Implies
    | Identifier '.' 'return'                       # TransExp_Return
    | Identifier '.' 'coreturn'                     # TransExp_Coreturn
    | Identifier '.' 'snd'                          # TransExp_Snd
    | Identifier '.' 'eval'                         # TransExp_TransEval
    | Identifier '.' 'true' Identifier              # TransExp_Bool
    | Identifier '.' 'false' Identifier             # TransExp_Bool
    | Identifier '.' 'inl'                          # TransExp_Inl
    | Identifier '.' 'inr'                          # TransExp_Inr
    | 'iso1' Identifier Identifier                  # TransExp_TransIso
    | 'iso2' Identifier Identifier                  # TransExp_TransIso
    | Identifier '.' 'relationalize'                # TransExp_Squash
    | 'delta' Identifier Identifier transform       # TransExp_Delta
    | 'sigma' Identifier Identifier transform       # TransExp_Sigma
    | 'SIGMA' Identifier Identifier Identifier      # TransExp_FullSigma
    | 'pi' Identifier Identifier transform          # TransExp_Pi
    | 'relationalize' Identifier Identifier transform # TransExp_Relationalize
    | 'id' Identifier                               # TransExp_Id
    | '(' transform 'then' transform ')'            # TransExp_Comp
    | Identifier '.' '(' transform '+' transform ')' # TransExp_Case
    | Identifier '.' '(' transform '*' transform ')' # TransExp_Prod
    | Identifier                                    # TransExp_Var
    | transConst                                    # TransExp_Const
    ;

transConst: '{' transConstXXX '}' ':' Identifier '->' Identifier ;
transConstXXX: 'nodes' transConstNode? (',' transConstNode)* ';' ;
transConstNode: Identifier '->' '{' transConstP '}' ;
transConstP: transConstPTerm? (',' transConstPTerm)* ;
transConstPTerm: '(' value ',' value ')' ;

dropDeclaration: 'drop' Identifier+ ;

path: Identifier ('.' Identifier)* ;


value:
        STRING
      | NUMBER
      | Identifier
      ;

STRING :  '"' (ESC | ~["\\])* '"' ;

fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

NUMBER
    :   '-'? INT '.' INT EXP?   // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP            // 1e10 -3e4
    |   '-'? INT                // -3, 45
    ;
fragment INT :   '0' | [1-9] [0-9]* ; // no leading zeros
fragment EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]

Identifier:
    IdLetter IdLetterOrDigit* ;
IdLetter:
    [a-zA-Z$_]+ ;
IdLetterOrDigit:
    [a-zA-Z0-9$_] ;

//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;
COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;