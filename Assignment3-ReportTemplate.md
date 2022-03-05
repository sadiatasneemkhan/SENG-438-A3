**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report #3 – Code Coverage, Adequacy Criteria and Test Case Correlation**

| Group \:  35     |            |
|-------------------|------------|
| Student Names:    |    UCID    |
| Luis Sulbaran     | 30090906   |
| Adam Abouelhassan | 30087777   |
| Jaxson Waterstreet| 30095706   |  
| Sadia Khan        | 30090271   |

(Note that some labs require individual reports while others require one report
for each group. Please see each lab document for details.)

# 1. Introduction

Text…

# 2. Manual Data-flow Coverage Calculations for DataUtiliites.calculateColumnTotal() and Range.combine()

Text…

# 3. Testing Strategy For New Unit Tests 

Our plan for this testing was to initially check our adequacy criteria for our test cases from assignment 2 and see where changes would need to be made to meet the given requirements for statement, branch and condition coverage. Upon completing this step, we discovered most of our methods covered in assignment 2 testing already met the criteria for this assignment. So we decided as a group to further expand our testing on these methods to increase our testing. Using our previous blackbox tests and EclEmma together, we looked into the methods being tested and saw what lines were partially covered or uncovered and developed test cases to test those lines to increase our coverage. After optimising out assignment 2 testing we felt that we should add 1 more method to develop some additional test cases to gain more experience.

# 4. How Code Coverage Was Increased For 5 Selected Test Cases

The five test cases that we designed to increase our code coverage are:

**test_expandToInclude_nullRange()**

With the addition of our test case, our **branch coverage** improved from 83.3% -> 100%, **statement coverage** from 85.7% -> 100%, and our **condition coverage** from 100% -> 100%

This new test case covered the rest of the functionality for the expandToInclude() method that our test cases in Assignment 2 did not cover initially. Our new test case covers for the condition when range == null. This is a condition that we did not test in A2 and using whitebox testing allowed us to analyze the code to ensure line and branch coverage were met to ensure 100% coverage in branch, line, and method.

**test_equal_aNull()**

With the addition of our test case, our **branch coverage** improved from 91.7% -> 100%, **statement coverage** from 100.0% -> 100%, and our **condition coverage** from 100% -> 100%

Prior to our new test case, we had only covered one of the branches for if the second array in the equal() argument was null. With branch coverage, we were able to ensure that our code tested for all possible decisions, so we implemented our new test case with the first argument array being null.

**test_equal_differentOuterDimensions()**

With the addition of our test case, our **branch coverage** improved from 91.7% -> 100%, **statement coverage** from 90.0% -> 100%, and our **condition coverage** from 100% -> 100%

The equal() method was a necessary method to be done using white-box testing compared to blackbox-testing because of the multiple definitions equal arrays could’ve meant. Our new test case covered the missing branch where both array lengths were not equal to each other.

Since we reached 100% code coverage after developing just these 3 test cases for our methods chosen in A2, we decided to test another method not tested in A2 and develop test cases that would create 100% coverage.

**test_combine_lowerBoundaryIsNull() and test_combine_validBoundaries()**

With the addition of our test cases, our **branch coverage** improved from 0% -> 100%, **statement coverage** from 0% -> 100%, and our **condition coverage** from 0% -> 100%

Since we did not cover the combine() method in A2, creating these test cases for 100% coverage was easy for us due to the fact that we had the source code. With the source code we were able to navigate through all possible cases for the method and implement efficient test cases that would cover all scenarios.


# 5 Coverage Achieved of Each Class and Method
## Intial Coverage Values (with Black Box Testing)

Figure 1: Initial Range Statement Coverage:
![LIR](https://user-images.githubusercontent.com/81999006/156495136-130c2d40-f813-4c63-9d3c-7cbbb630e4c0.png)

Figure 2: Initial Range Branch Coverage:
![BIR](https://user-images.githubusercontent.com/81999006/156495361-e027e3b2-95ba-4db0-bf7d-f12438dc20fb.png)

Figure 3: Initial Range Condition Coverage:
![CIR](https://user-images.githubusercontent.com/81999006/156495377-ef21fbae-c219-4afe-a9f2-ed629a1fb779.png)

Figure 4: Initial DataUtilities Statement Coverage:
![DSL](https://user-images.githubusercontent.com/81999006/156495711-1dc25e46-761d-449f-968c-b1c311126e5a.png)

Figure 5: Initial DataUtilities Branch Coverage:
![DBL](https://user-images.githubusercontent.com/81999006/156495735-bf0ae793-7464-4960-9b6f-3d120bfca773.png)

Figure 6: Initial DataUtilities Condition Coverage:
![DCL](https://user-images.githubusercontent.com/81999006/156495750-d62b7880-042a-4bc5-a529-423285148838.png)

## Improved Coverage Values (with White Box Testing)

Figure 7: Final Range Statement Coverage:
![RSA](https://user-images.githubusercontent.com/81999006/156495460-119d7cda-38da-4e1d-8bf9-bf730666073b.png)

Figure 8: Final Range Branch Coverage:
![RBA](https://user-images.githubusercontent.com/81999006/156495485-e3881fb1-d6d9-4d26-96d9-f0749c691185.png)

Figure 9: Final Range Condition Coverage:
![RCA](https://user-images.githubusercontent.com/81999006/156495501-b5414f8b-b8e6-46db-bf22-01209a4fdaba.png)

Figure 10: Final DataUtilities Statement Coverage:
![SD](https://user-images.githubusercontent.com/81999006/156495892-8db73ecb-1bf8-4710-be69-154c52cf10df.png)

Figure 11: Final DataUtilities Branch Coverage:
![BD](https://user-images.githubusercontent.com/81999006/156495929-b6af5373-76f0-424b-b5cc-cda6a9a76f78.png)

Figure 12: Final DataUtilities Condition Coverage:
![DCL](https://user-images.githubusercontent.com/81999006/156495750-d62b7880-042a-4bc5-a529-423285148838.png)

The methods calculateColumnTotal() and clone() were not able to be improved for branch coverage. Their branch coverage remains at their intial 75% due to an infeasible path. The branch that is not covered is the else branch, where n == null. Since null values are checked for at the beginning of both functions (ParamChecks.nullNotPermitted), this branch path is completely infeasible.

# 6 Pros and Cons of Coverage Tools Used and Metrics 

Our group decided to use EclEmma for our code coverage tool as it was the one recommended in the assignment document. We did not run into many issues with the usage of EclEmma besides a few minor problems with familiarising ourselves with navigating the tool to show the necessary criteria such as branch, statement and condition coverage. EclEmma was quite useful for whitebox testing, as it showed the coverage of the system under test with colour coded lines. With green lines being covered, red being uncovered and yellow being partially covered, it made it very easy to monitor our progress while developing test cases for a method and see which segments still needed to be covered.

# 7 Comparison on the Advantages and Disadvantages of Requirements-based Test Generation and Coverage-based Test Generation.

We have learned that test generation is a crucial skill to have as developers to ensure that we are creating software that is efficient and reliable in all scenarios of use. Requirements-based generation testing is a method used in which test cases are developed to accomplish test objectives and conditions from requirements. It has a couple of advantages in which testing is easier because it is focused solely on if the output is as expected and not how it operates. It also follows a well-defined and time-boxed structure in that not many test cases are needed if the proper output is being generated. However, this can lead to its disadvantage which we discovered throughout this lab, which is that not all edge cases and functionalities of the method can be considered just through requirements testing. 

The coverage-based test generation that we used in this lab is a white-box testing method that tests the percentage of all possibilities of requirements that are satisfied in a method. An advantage to this method is that it ensures that test cases are well distributed around all functionalities and not just a single part of the code. It also helps in achieving 100% test coverage, which ensures that all code has been properly analyzed and ran through. Disadvantages to this method is that just because it may achieve 100% test coverage, it doesn’t cover bugs that may be present in the code. It also enforces you to create a lot of test cases to ensure that the 100% coverage is reached which is not the case for requirements testing.

# 8 Team Work and Work Division

The work for the lab exercise was done on zoom with one person sharing their screen while the others made comments and gave ideas about what tests to create. Once the desired coverage was achieved, we moved to the lab report. The lab report was divided into sections and assigned to each group member. Each group member was responsible for a few sections of the lab report and had to complete their sections by the day before the submission deadline, in order for the group to meet and look over each section. Each section was approved by all the group members before submitting the report.

# 9 Difficulties Encountered, Challenges Overcome, and Lessons Learned

Initially, our understanding of the lab assignment was to create white box tests for all the methods in Range.java and DataUtilities.java. After creating the tests and achieving the target coverages, we were informed that we only needed to create white box tests for the methods chosen in Lab 2. This misunderstanding caused us to waste a lot of time on unnecessary tests. Apart from that, this lab taught us about statement, branch, and condition coverage, as well as how to improve coverage by implementing more test cases.

# 10 Comments/Feedback

The assignment was helpful for us to grow our knowledge on white box testing and coverage however, the lab exercise instructions were slightly unclear which caused us to do unnecessary work.
