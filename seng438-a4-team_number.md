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

Mutant 6: Line 161 - Less than to less or equal -> SURVIVED
This mutation changes part of the condition to check if variable b0 is less than this.upper to check if variable b0 is less than or equal to this.upper. For this to affect the test results for methods that test intersects, we would first need b0 to be greater than this.lower. Additionally we would need b0 to be equal to this.upper. None of our test cases cover this specific situation meaning all tests that interact with intersects will still pass even with this mutation in place. Thus, this mutation survives.

Mutant 7: Line 176 - replaced boolean return with false for org/jfree/data/Range::intersects -> KILLED by testIntersectsWithRangeParam
This tests method testIntersectsWithRangeParam creates two Range objexts, one with lower bound 1, upper bound 4, and another with lower bound 2, upper bound 3. Since these two ranges intersects, the test expects the return from intersects to be true, however, this mutant changes the return value to false, meaning this test will fail and the mutant is killed.

Mutant 8: Line 312 - replaced return value with null for org/jfree/data/Range::expandToInclude -> KILLED by testExpandToIncludeAllSame
This test method testExpandToIncludeAllSame expects an expanded Range object. This mutation returns null instead of the resulting expanded Range object, and as a result, the test fails and this mutation is killed.

Mutant 9: Line 411 - removed call to java/lang/IllegalArgumentException -> KILLED by testScaleWithFactorLessThanZero
This mutation removes the call to IllegalArgumentException when factor is negative. The test testScaleWithFactorLessThanZero calls the scale method with a value for factor of -1, therefore the test expects scale to throw an IllegalArgumentException. Since the mutation removes the call to the exception, this test fails and the mutant is killed.

Mutant 10: Line 431 - replaced boolean return with true for org/jfree/data/Range::equals -> KILLED by testEqualsLowerBoundNotEqual
The equals method checks to see if two Range objects are equal. That is, the lower bounds and upper bounds of both Range objects are equal. The test, testEqualsLowerBoundNotEqual, creates two Range objects, one with lower bound -3, and one with lower bound -7. Since these two lower bounds are not equal, the method equals should return false. However, this mutation changes the boolean value from false to true after verifying that the lower bounds of both Range objects are not equal. Since the method now returns false, the test fails and this mutation is killed.

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
Updated Mutation Coverage = (with improved tests written)




Test Suite Class: Range




# Analysis drawn on the effectiveness of each of the test classes
DataUtilities Classes That Improved Score
-------------------------
- calculateColumnTotalForRowBeingEqualToRowCount()




Range Classes That Improved Score
------------------------


# A discussion on the effect of equivalent mutants on mutation score accuracy

# A discussion of what could have been done to improve the mutation score of the test suites

# Why do we need mutation testing? Advantages and disadvantages of mutation testing

We need mutation testing to determine the effectiveness of software. Mutation testing allows us (developers/testers) to determine how effecitive our test suites are by getting the perecentage of mutants that tests can detect. When Mutation Coverage percentage is high that means that test suites are effective and can determine potential faults in code. It also has the advatage of helping testers determine which areas of code is not covered by test suites already written. This helps identify weaknesses in our code by outlining which sections of a method were not properly tested. A disadvantage of mutation testing is how time consuming the process is, and as code size increases the number of mutants will grow as well, and testing becomes much more time consuming. Mutation testing can also have false positive and negatives, this means mutants that are not actual faults but detected by tests will come up as false positives. This causes testers to waste a lot of time looking to fix non existent faults. For companies since mutation testing is very time consuming it can be very costly as well.

# Explain your SELENUIM test case design process

We decided to test the basic functionalities of the IKEA website, including searching for items, logging in, entering a postal code, and others. As with unit testing, it is important to test small parts of the website at a time to isolate issues. We tested individual features and ensured that they had minimal interactions with other functionalities on the website.

# Explain the use of assertions and checkpoints

# how did you test each functionaity with different test data

# Discuss advantages and disadvantages of Selenium vs. Sikulix

# How the team work/effort was divided and managed

For the mutation testing portion of the lab, we were required to improve the mutation test score by 10% for the Range and DataUtilities classes. Each person was responsible for improving the score for one class by 5%. For the GUI testing portion, each person was responsible for creating 2 tests with Selenium. We split up the work for the report evenly among us. As issues arose, we collaborated to solve them, communicating through text, in person meetings, and video calls. 

# Difficulties encountered, challenges overcome, and lessons learned

We initially found the Pitest mutation descriptions to be unclear at times. This caused slow progress in the beginning, but as we began to notice patterns in the descriptions, we were able to write tests more quickly. Another obstacle we faced was the slow execution time of Pitest. Waiting 20 or more minutes to test our test cases extended the time it took to complete this lab. Due to the long wait times, learning to multitask while working on this assignment was important. Another challenge was determining how much we needed to improve our DataUtilities tests as we already had a score of 89% which is an extremly good score as explain to us by the professor, so improving it by 10% did not seem possible as he explained getting a score of 90-95% would be great in mutation testing. We also became proficient with Selenium and gained an understanding of GUI testing. While this concept was overwhelming in the beginning, we were soon able to use Selenium with confidence. 

# Comments/feedback on the lab itself

It would have been helpful to have some more detailed resources about understanding Pitest mutation descriptions. As well it would have been helpful to determine a faster way to run Pistest as some group memebers were able to run the tests in 5-10 minutes, and for others it took 25-35 minutes. The lab was very time consuming our group found that it was taking hours to just improve mutation scores by 1%.
