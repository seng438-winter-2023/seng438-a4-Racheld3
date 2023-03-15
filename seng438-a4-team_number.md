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

# Explain the use of assertions and checkpoints

# how did you test each functionaity with different test data

# Discuss advantages and disadvantages of Selenium vs. Sikulix

# How the team work/effort was divided and managed

# Difficulties encountered, challenges overcome, and lessons learned

# Comments/feedback on the lab itself
