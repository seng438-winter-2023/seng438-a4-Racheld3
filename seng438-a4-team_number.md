**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#4 – Mutation Testing and Web app testing**

| Group \#: 10              |  
| ------------------------- |
| Student Names:            |     
| Saina Ghasemian-Roudsari  |     
| Ana Perrone               |     
| Rachel Dalton             |     
| Isaiah Lemieux            |

# Introduction


# Analysis of 10 Mutants of the Range class 

Mutant 1: Line 93 - removed call to java/lang/IllegalArgumentException -> KILLED by testRangeConstructorWithLowerLessThanUpper
Initially, this tests passes as a Range object cannot be created with a lower bound higher than upper bound. Pitest removes the call to the exception IllegalArgumentException, and because the test is expecting this exception to be thrown but is not thrown in the presence of the mutant, the test fails, killing this mutant.

Mutant 2: Line 105 - replaced return of double value with -(x + 1) for org/jfree/data/Range::getLowerBound -> KILLED by testGetLowerBoundForLowerBoundZero
The test method testGetLowerBoundForLowerBoundZero() creates a Range object with a lower bound of 0 and an upper bound of 3. It then calls the getLowerBound() function and initially passes as the method simply returns the lower bound. With the mutant in place, the return value is changed to -(x + 1). This means for our particular case, the return value will be -(0 + 1) = -1. The test method is expecting the return value to be 0, so when -1 is returned, the test fails and this mutant is killed.

Mutant 3: Line 114 - incremented (++a) double field upper -> KILLED by getUpperBoundForUpperBoundNegative
The test method getUpperBoundForUpperBoundNegative creates a Range object with lower bound of -67 and upper bound of -14. It then calls the getUpperBound function and initially passes as the method simply returns the uper bound. With the mutant in place, the return value is first incremented (by 1) then returned from getUpperBound to the test method. The test is expecting a return value of -14, so when getUpperBound returns -14 + 1 = -13, the test fails and this mutant is killed.

Mutant 4: Line 132 - decremented (a--) double field lower -> SURVIVED
This mutant is a post-fix increment to the field lower in getCentralValue. Since it only increments lower after it is used in an operation, the increment does not affect the resulting calculation in getCentralValue, meaning all tests that call getCentralValue all still pass, meaning the mutant survived.

Mutant 5: Line 144 - replaced boolean return with false for org/jfree/data/Range::contains -> KILLED by testContainsBelowUpperBoundOfRange
The test method testContainsBelowUpperBoundOfRange creates a Range object with lower bound -72.55 and upper bound of -23. It then calls the contains method with an argument of -23.778. Initially this test passes as -23.778 is obviously within the range as stated above, but this mutant changes the return value from contains to false, meaning the test fails as it is expecting a return value of true, killing this mutant.

Mutant 6:

Mutant 7:

Mutant 8: 

Mutant 9:

Mutant 10:

# Report all the statistics and the mutation score for each test class
Original Statistics and Mutation Scores
---------------------------------------
Test Suite Class: DataUtilities
Original Mutation Coverage = 88% (with improved tests from assignment 3)
<img width="874" alt="Screenshot 2023-03-15 at 9 17 32 AM" src="https://user-images.githubusercontent.com/76859857/225356378-67b1581f-1414-4d1e-8a50-f2a90e03d48d.png">

Test Suite Class: Range
Original Mutation Coverage = 70% (with improved tests from assignment 3)



Updated Statistics and Mutation Scores
---------------------------------------
Test Suite Class: DataUtilities





Test Suite Class: Range




# Analysis drawn on the effectiveness of each of the test classes
DataUtilities Classes That Improved Score
-------------------------

Range Classes That Improved Score
------------------------


# A discussion on the effect of equivalent mutants on mutation score accuracy

# A discussion of what could have been done to improve the mutation score of the test suites

# Why do we need mutation testing? Advantages and disadvantages of mutation testing





# Explain your SELENUIM test case design process

# Explain the use of assertions and checkpoints

# how did you test each functionaity with different test data

# Discuss advantages and disadvantages of Selenium vs. Sikulix

# How the team work/effort was divided and managed

# Difficulties encountered, challenges overcome, and lessons learned

# Comments/feedback on the lab itself
