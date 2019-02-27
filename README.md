# comp474s19project1 - J. Conway

## About This Repo
- This is the repo for my submission of Project 1 of COMP 474, offered in the Spring of 2019 by Loyola University Chicago


## The File Structure
- The specifications for this project are contained in Specification.pdf
### Part 1
- This contains the submission for Part 1, as described in Specification.pdf
- The only file is Part1Submission.pdf, which can be downloaded and opened using any PDF reader
### Part 2
- This contains the submission from Part 2, as described in Specification.pdf
- Part1Resubmission.pdf is an updated version of Part1Submission.pdf from the Part 1 folder. It contains adjustments based on the feedback from the instructor
- The src folder contains the source code needed for the Part 2 submission
  - The unit tests specified in Part 1 are contained in ShoppingCartTest.java
  - TestLog.xml contains the test results from the final run of the completed program

## Running the Code
- The easiest way to run this code is to load the code into Eclipse and simply press the "Build" button
- Alternatively, you can do the following:
  1. Download the src folder and compile each of the Java files
    - Note that ShoppingCartTest.java must be compiled using JUnit
  2. Then run ShoppingCartTest.java using JUnit

## Writing Black Box Tests
- In order to write new Black Box Tests, do the following:
  1. Open ShoppingCartTest.java
  2. Scroll to the blackBoxTests() method
  3. If testing "ShoppingCart.calculatePurchasePrice()", do the following:
    1. Add items to the product database using the following command format:
      - Database.addItem(String itemID, double price);
    2. Create a customer using the following constructor:
      - Customer c = new Customer(int customerID, boolean discountMember, boolean taxExempt);
    3. Create an ArrayList<String> of itemIDs to indicate the items you want in the cart, like so:
      - ArrayList<String> itemList = new ArrayList<String>(Arrays.asList(String itemID1, ... , String itemIDn));
    4. Generate a test using the following syntax:
      - assertArrayEquals(String[] expectedOutputs, sc.calculatePurchasePrice(ArrayList<String> itemList, Customer customer));)
  - If testing "ShoppingCart.roundOff()", do the following:
    1. Create a test using the following syntax
      - assertEquals(String expectedOutput, String.valueOf(ShoppingCart.roundOff(double testValue)));
