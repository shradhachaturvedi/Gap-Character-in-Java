# Gap-Character-in-Java
Suppose we allow the pattern P to contain occurrences of a gap character <> that can match an arbitrary string of characters (even one of zero length). 
For example, the pattern ab<>ba<>c occurs in the text cabccbacbacab as
          c  ab  cc  ba  cba  c  ab
             ab  <>  ba  <>   c
Note that the gap character may occur an arbitrary number of times in the pattern but not at all in the text. 
This is am implementation of a polynomial-time algorithm to determine whether such a pattern P occurs in a given text T, and analyze the running time of your algorithm.
