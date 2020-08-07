# TEST JAVA
une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
Exemples d'entrées et sorties : 

partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]

## Pre-requisites
* JDK 8+
* JUnit 4

# Project tree

src
 * [main](src/main)
   * [OperationMain.java](src/main/OperationMain.java)
 * [test](src/test)
   * [OperationMainTest.java](src/test/OperationMainTest.java)
JUnit4
 * [junit.jar](JUnit4/junit.jar)
