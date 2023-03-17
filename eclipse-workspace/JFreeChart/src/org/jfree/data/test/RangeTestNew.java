package org.jfree.data.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.Range;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Test;

public class RangeTestNew{

	/**
	 * getLowerBound() tests
	 */
	
	@Test
	public void testGetLowerBoundForLowerBoundPositive() 
	{
		//setup
		final Range testRange = new Range(185, 2003);
		double result = testRange.getLowerBound();
		double expectedResult = 185;
		
		//verify
		assertEquals(expectedResult, result, .000000001d);
		
	}
	
	@Test
	public void testGetLowerBoundForLowerBoundAboveZero() 
	{
		//setup
		final Range testRange = new Range(1, 3);
		double result = testRange.getLowerBound();
		double expectedResult = 1;
		
		//verify
		assertEquals(expectedResult, result, .000000001d);
		
	}
	
	@Test
	public void testGetLowerBoundForLowerBoundZero() 
	{
		//setup
		final Range testRange = new Range(0, 3);
		double result = testRange.getLowerBound();
		double expectedResult = 0;
		
		//verify
		assertEquals(expectedResult, result, .000000001d);
		
	}
	
	@Test
	public void testGetLowerBoundForLowerBoundBelowZero() 
	{
		//setup
		final Range testRange = new Range(-1, 5);
		double result = testRange.getLowerBound();
		double expectedResult = -1;
		
		//verify
		assertEquals(expectedResult, result, .000000001d);
		
	}
	
	@Test
	public void testGetLowerBoundForLowerBoundNegative()
	{
		//setup
		final Range testRange = new Range(-8, 3);
		double result = testRange.getLowerBound();
		double expectedResult = -8;
		
		//verify
		assertEquals(expectedResult, result, .000000001d);
		
	}
	
	@Test
	public void testGetLowerBoundForSameLowerAndUpperBounds() 
	{
		//setup
		final Range testRange = new Range(0, 0);
		double result = testRange.getLowerBound();
		double expectedResult = 0;
		
		//verify
		assertEquals(expectedResult, result, .000000001d);
		
	}
	
	/**
	 * getUpperBound() tests
	 */
	
	@Test
	public void getUpperBoundForUpperBoundPositive() 
	{
		//setup
		final Range testRange = new Range(89.76, 93.295);
		double result = testRange.getUpperBound();
		double expectedResult = 93.295;
		
		//verify
		assertEquals(expectedResult, result, .000000001d);
		
	}
	
	@Test
	public void getUpperBoundForUpperBoundAboveZero() 
	{
		//setup
		final Range testRange = new Range(-6.01, 0.65);
		double result = testRange.getUpperBound();
		double expectedResult = 0.65;
		
		//verify
		assertEquals(expectedResult, result, .000000001d);
		
	}
	
	@Test
	public void getUpperBoundForUpperBoundZero() 
	{
		//setup
		final Range testRange = new Range(-8, 0);
		double result = testRange.getUpperBound();
		double expectedResult = 0;
		
		//verify
		assertEquals(expectedResult, result, .000000001d);
		
	}
	
	@Test
	public void getUpperBoundForUpperBoundBelowZero() 
	{
		//setup
		final Range testRange = new Range(-4.7, -0.959);
		double result = testRange.getUpperBound();
		double expectedResult = -0.959;
		
		//verify
		assertEquals(expectedResult, result, .000000001d);
		
	}
	
	@Test
	public void getUpperBoundForUpperBoundNegative() 
	{
		//setup
		final Range testRange = new Range(-67, -14);
		double result = testRange.getUpperBound();
		double expectedResult = -14;
		
		//verify
		assertEquals(expectedResult, result, .000000001d);
		
	}
	
	@Test
	public void testGetUpperBoundForSameLowerAndUpperBounds() 
	{
		//setup
		final Range testRange = new Range(0, 0);
		double result = testRange.getUpperBound();
		double expectedResult = 0;
		
		//verify
		assertEquals(expectedResult, result, .000000001d);
		
	}
	
	/**
	 * getLength() tests
	 */
	
	@Test
	public void getLengthForValidRange() 
	{
		final Range testRange = new Range(1, 11);
		double result = testRange.getLength();
		double expectedResult = 10;
		
		//verify
		assertEquals(expectedResult, result, 0.00001);
	}
	
	@Test
	public void getLengthForZeroLowerPositiveUpper() 
	{
		final Range testRange = new Range(0, 10);
		double result = testRange.getLength();
		double expectedResult = 10;
		
		//verify
		assertEquals(expectedResult, result, 0.00001);
	}
	
	@Test
	public void getLengthForNegativeLowerPositiveUpper() 
	{
		final Range testRange = new Range(-5, 10);
		double result = testRange.getLength();
		double expectedResult = 15;
		
		//verify
		assertEquals(expectedResult, result, 0.00001);
	}
	
	@Test
	public void getLengthForNegativeLowerZeroUpper() 
	{
		final Range testRange = new Range(-5, 0);
		double result = testRange.getLength();
		double expectedResult = 5;
		
		//verify
		assertEquals(expectedResult, result, 0.00001);
	}
	
	@Test
	public void getLengthForNegativeLowerNegativeUpper() 
	{
		final Range testRange = new Range(-10, -5);
		double result = testRange.getLength();
		double expectedResult = 5;
		
		//verify
		assertEquals(expectedResult, result, 0.00001);
	}
	
	@Test
	public void getLengthForIdenticalLowerUpper() 
	{
		final Range testRange = new Range(1, 1);
		double result = testRange.getLength();
		double expectedResult = 0;
		
		//verify
		assertEquals(expectedResult, result, 0.00001);
	}

	/**
	 * Tests for getCentralValue()
	 */
	
	@Test
	public void testGetCentralValueForLowerBoundPositiveUpperBoundPositive() {
		//setup
		final Range testRange = new Range(5, 18.5);
		double result = testRange.getCentralValue();
		double expectedResult = 11.75;
		
		//verify
		assertEquals(expectedResult, result, 0.001);
	}
	
	@Test
	public void testGetCentralValueForLowerBoundZeroUpperBoundPositive() {
		//setup
		final Range testRange = new Range(0, 12);
		double result = testRange.getCentralValue();
		double expectedResult = 6;
		
		//verify
		assertEquals(expectedResult, result, 0.001);
	}
	
	@Test
	public void testGetCentralValueForLowerBoundNegativeUpperBoundPositive() {
		//setup
		final Range testRange = new Range(-7.5, 4);
		double result = testRange.getCentralValue();
		double expectedResult = -1.75;
		
		//verify
		assertEquals(expectedResult, result, 0.001);
	}
	
	@Test
	public void testGetCentralValueForLowerBoundNegativeUpperBoundZero() {
		//setup
		final Range testRange = new Range(-16, 0);
		double result = testRange.getCentralValue();
		double expectedResult = -8;
		
		//verify
		assertEquals(expectedResult, result, 0.001);
	}
	
	@Test
	public void testGetCentralValueForLowerBoundNegativeUpperBoundNegative() {
		//setup
		final Range testRange = new Range(-23.12, -22.45);
		double result = testRange.getCentralValue();
		double expectedResult = -22.785;
		
		//verify
		assertEquals(expectedResult, result, 0.001);
	}
	
	@Test
	public void testGetCentralValueForRangeOfLengthZero() {
		//setup
		final Range testRange = new Range(9, 9);
		double result = testRange.getCentralValue();
		double expectedResult = 9;
		
		//verify
		assertEquals(expectedResult, result, 0.001);
	}
	
	/**
	 * Tests for contains()
	 */
	
	@Test
	public void testContainsAboveUpperBoundOfRange() {
		//setup
		final Range testRange = new Range(-6.80, 12.895);
		boolean result = testRange.contains(13);
		boolean expectedResult = false;
		
		//verify
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testContainsAtUpperBoundOfRange() {
		//setup
		final Range testRange = new Range(0, 98.9234);
		boolean result = testRange.contains(98.9234);
		boolean expectedResult = true;
		
		//verify
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testContainsBelowUpperBoundOfRange() {
		//setup
		final Range testRange = new Range(-72.55, -23);
		boolean result = testRange.contains(-23.778);
		boolean expectedResult = true;
		
		//verify
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testContainsForNominalValue() {
		//setup
		final Range testRange = new Range(10.5, 24.68);
		boolean result = testRange.contains(17.9);
		boolean expectedResult = true;
		
		//verify
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testContainsAboveLowerBoundOfRange() {
		//setup
		final Range testRange = new Range(-54.5, 0);
		boolean result = testRange.contains(-53.9);
		boolean expectedResult = true;
		
		//verify
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testContainsAtLowerBoundOfRange() {
		//setup
		final Range testRange = new Range(67, 123);
		boolean result = testRange.contains(67);
		boolean expectedResult = true;
		
		//verify
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testContainsBelowLowerBoundOfRange() {
		//setup
		final Range testRange = new Range(-5.006, -1.11);
		boolean result = testRange.contains(-6.123);
		boolean expectedResult = false;
		
		//verify
		assertEquals(expectedResult, result);
	}
	
	/**
	 * new tests created for assignment 3
	 */
	
	/**
	 * tests for scale()
	 */
	
	@Test (expected = IllegalArgumentException.class)
	public void testScaleWithFactorLessThanZero() {
		//setup
		final Range testRange = new Range(0, 0);
		double factor = -1;
		
		Range.scale(testRange, factor);
	}
	
	@Test
	public void testScaleWithFactorGreaterThanZero() {
		//setup
		final Range testRange = new Range(10, 20);
		double factor = 2;
		Range result = Range.scale(testRange, factor);
		Range expectedResult = new Range(20, 40);
		
		//verify
		assertEquals(result, expectedResult);
	}
	
	@Test
	public void testShiftWithTwoParams() {
		//setup
		final Range testRange = new Range(5, 7);
		double delta = -5;
		Range result = Range.shift(testRange, delta);
		Range expectedResult = new Range(0, 2);
		
		//verify
		assertEquals(result, expectedResult);
	}
	
	@Test
	public void testShiftAllowZeroCrossing() {
		//setup
		final Range testRange = new Range(-6, -1.5);
		double delta = 10;
		Range result = Range.shift(testRange, delta, true);
		Range expectedResult = new Range(4, 8.5);
		
		//verify
		assertEquals(result, expectedResult);
	}
	
	@Test 
	public void testShiftWithNoZeroCrossingForNegativeValueAndZeroValue() {
		//setup
		final Range testRange = new Range(-9, 0);
		double delta = 6;
		Range result = Range.shift(testRange, delta);
		Range expectedResult = new Range(-3, 6);
		
		
		//verify
		assertEquals(result, expectedResult);
	}
	
	/**
	 * test for Range()
	 */
	
	@Test (expected = IllegalArgumentException.class)
	public void testRangeConstructorWithLowerLessThanUpper() {
		final Range testRange = new Range(5, 1);
	}

	//Tests for combine(Range, Range)
	
	@Test
	public void testCombineWithFirstRangeNull() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		Range result = Range.combine(null, testRange);
		Range expectedResult = new Range(-3, 7);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testCombineWithSecondRangeNull() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		Range result = Range.combine(testRange, null);
		Range expectedResult = new Range(-3, 7);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testCombineWithTwoRanges() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		final Range testRange2 = new Range(1, 10);
		Range result = Range.combine(testRange, testRange2);
		Range expectedResult = new Range(-3, 10);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	//Tests for combineIgnoringNaN(Range, Range)
	@Test
	public void testCombineIgnoringNaNWithFirstRangeNaN() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		final Range testRange2 = new Range(Double.NaN, Double.NaN);
		Range result = Range.combineIgnoringNaN(testRange2, testRange);
		Range expectedResult = new Range(-3, 7);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testCombineIgnoringNaNWithSecondRangeNaN() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		final Range testRange2 = new Range(Double.NaN, Double.NaN);
		Range result = Range.combineIgnoringNaN(testRange, testRange2);
		Range expectedResult = new Range(-3, 7);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testCombineIgnoringNaNWithTwoRanges() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		final Range testRange2 = new Range(1, 10);
		Range result = Range.combineIgnoringNaN(testRange, testRange2);
		Range expectedResult = new Range(-3, 10);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testCombineIgnoringNaNWithTwoNaNRanges() {
		
		//setup
		final Range testRange = new Range(Double.NaN, Double.NaN);
		final Range testRange2 = new Range(Double.NaN, Double.NaN);
		Range result = Range.combineIgnoringNaN(testRange, testRange2);
		Range expectedResult = null;
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testCombineIgnoringNaNWithTwoNullRanges() {
		
		//setup
		Range result = Range.combineIgnoringNaN(null, null);
		Range expectedResult = null;
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testCombineIgnoringNaNWithFirstRangeNull() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		Range result = Range.combineIgnoringNaN(null, testRange);
		Range expectedResult = new Range(-3, 7);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testCombineIgnoringNaNWithSecondRangeNull() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		Range result = Range.combineIgnoringNaN(testRange, null);
		Range expectedResult = new Range(-3, 7);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testCombineIgnoringNaNWithFirstRangeNaNSecondRangeNull() {
		
		//setup
		final Range testRange = new Range(Double.NaN, Double.NaN);
		Range result = Range.combineIgnoringNaN(testRange, null);
		Range expectedResult = null;
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testCombineIgnoringNaNWithFirstRangeNullSecondRangeNaN() {
		
		//setup
		final Range testRange = new Range(Double.NaN, Double.NaN);
		Range result = Range.combineIgnoringNaN(null, testRange);
		Range expectedResult = null;
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	//Tests for constrain(double)
	
	@Test
	public void testConstrainLowerValueNotContained() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		double result = testRange.constrain(-4.8);
		double expectedResult = -3;
		
		//verify
		assertEquals(expectedResult, result, 0.000001);
		
		}
	
	@Test
	public void testConstrainUpperValueNotContained() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		double result = testRange.constrain(48);
		double expectedResult = 7;
		
		//verify
		assertEquals(expectedResult, result, 0.000001);
		
		}
	
	@Test
	public void testConstrainValueContained() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		double result = testRange.constrain(0);
		double expectedResult = 0;
		
		//verify
		assertEquals(expectedResult, result, 0.000001);
		
		}
	
	//Tests for Equals(Object)
	@Test
	public void testEqualsObjectNotRange() {
		
		//setup
		final Object testObject = new Object();
		final Range testRange = new Range(-3, 7);
		boolean result = testRange.equals(testObject);
		boolean expectedResult = false;
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testEqualsLowerBoundNotEqual() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		final Range testRange2 = new Range(-7, 7);
		boolean result = testRange.equals(testRange2);
		boolean expectedResult = false;
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testEqualsUpperBoundNotEqual() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		final Range testRange2 = new Range(-3, 0);
		boolean result = testRange.equals(testRange2);
		boolean expectedResult = false;
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testEqualsRangeEqual() {
		
		//setup
		final Range testRange = new Range(-3, 7);
		final Range testRange2 = new Range(-3, 7);
		boolean result = testRange.equals(testRange2);
		boolean expectedResult = true;
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	//Tests for hashCode()
	
	@Test
	public void testHashCode() {
		
		//setup
		final Range testRange = new Range(0, 0);
		int result = testRange.hashCode();
		int expectedResult = 0;
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	//Tests for expand()
	@Test
	public void testExpandSameLowerAndUpper() {
		
		
		//setup
		final Range testRange = new Range(4,10);
		double lower = 0.5;
		double upper = 0.5;
		Range result = Range.expand(testRange, lower, upper);
		Range expectedResult = new Range(1,13);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testExpand() {
		
		
		//setup
		final Range testRange = new Range(2,3);
		double lower = 0;
		double upper = -5;
		Range result = Range.expand(testRange, lower, upper);
		Range expectedResult = new Range(0,0);	
		//verify
		assertEquals(expectedResult, result);
			
	}
	
	//Tests for expandToInclude()
	@Test
	public void testExpandToIncludeLower() {
		
		
		//setup
		final Range testRange = new Range(4,10);
		Range result = Range.expandToInclude(testRange, 0);
		Range expectedResult = new Range(0,10);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	@Test
	public void testExpandToIncludeUpper() {
		
		
		//setup
		final Range testRange = new Range(4,10);
		Range result = Range.expandToInclude(testRange, 15);
		Range expectedResult = new Range(4,15);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testExpandToIncludeNULL() {
		
		
		//setup
		final Range testRange = null;
		Range result = Range.expandToInclude(testRange, 15);
		Range expectedResult = new Range(15,15);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	@Test
	public void testExpandToIncludeAllSame() {
		
		
		//setup
		final Range testRange = new Range(15,15);
		Range result = Range.expandToInclude(testRange, 15);
		Range expectedResult = new Range(15,15);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	//Tests for intersects()
	@Test
	public void testIntersectsWithRangeParam() {
		
		//setup 
		final Range testRange = new Range(1,4);
		final Range testRange2 = new Range(2,3);
		boolean result = testRange2.intersects(testRange);
		boolean expected = true;
		
		//verify
		assertEquals(expected, result);
	}
	
	@Test
	public void testIntersectsWithValidBoundParams() {
		
		//setup 
		final Range testRange = new Range(1,4);
		boolean result = testRange.intersects(2,3);
		boolean expected = true;
		
		//verify
		assertEquals(expected, result);
	}
	
	@Test
	public void testIntersectsWithNonIntersectingBounds() {
		
		//setup 
		final Range testRange = new Range(1,4);
		boolean result = testRange.intersects(-1,0);
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
	
	@Test
	public void testIntersectsWithInvalidRange() {
		
		//setup 
		final Range testRange = new Range(5,12);
		boolean result = testRange.intersects(9,7);
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
	
	@Test
	public void testIntersectsWithInvalidBoundParams() {
		
		//setup 
		final Range testRange = new Range(1,4);
		boolean result = testRange.intersects(5,6);
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
	
	//Tests for isNaNRange
	@Test
	public void testIsNaNRange() {
		
		//setup
		final Range testRange =new Range(Double.NaN, Double.NaN);
		//verify
		boolean result = testRange.isNaNRange();
		boolean expected = true;
		
		//verify
		assertEquals(expected, result);
	}
	
	//Tests for toString()
//	@Test
//	public void testToString() {
//		
//		
//		//setup
//		final Range testRange = new Range(4,5);
//		String result = testRange.toString();
//		String expectedResult = new String("Range[4,5]");
//		
//		//verify
//		assertEquals(expectedResult, result);
//		
//		}
	
	//ASSIGNMENT 4 TESTS
	
	//Tests for intersects(Range)
	
	//Killed mutant: replaced boolean return with true for org/jfree/data/Range::intersects
	@Test
	public void testIntersectsRangeDoesNotIntersect() {
		
		//setup 
		final Range testRange = new Range(1,4);
		final Range testRange2 = new Range(6,7);
		boolean result = testRange2.intersects(testRange);
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
	
	//Killed mutant: removed call to org/jfree/data/Range::getLowerBound
	@Test
	public void testIntersectsRangeDoesNotIntersectButWouldIfLowerBoundWas0() {
		
		//setup 
		final Range testRange = new Range(5,10);
		final Range testRange2 = new Range(-1,4);
		boolean result = testRange2.intersects(testRange);
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
		
	//Tests for intersects(double, double)
	//SHOULD WORK BUT DOESN'T
	@Test
	public void testIntersectsWhenLowerBoundIncremented() {
		
		//setup 
		final Range testRange = new Range(1,1);
		double testValue1 = 2;
		double testValue2 = 3;
		boolean result = testRange.intersects(testValue1,testValue2);
		result = testRange.intersects(testValue1,testValue2);
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
	
	@Test
	public void testIntersectsWhenLowerBoundDecremented() {
		
		//setup 
		final Range testRange = new Range(1,1);
		double testValue1 = -1;
		double testValue2 = 0;
		boolean result = testRange.intersects(testValue1,testValue2);
		result = testRange.intersects(testValue1,testValue2);
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
	
	//Tests for toString()
	//Killed the following:
//	removed call to java/lang/StringBuilder::<init> → KILLED
//
//	 replaced return value with "" for org/jfree/data/Range::toString → KILLED
//
//	 removed call to java/lang/StringBuilder::append → KILLED
//
//	 removed call to java/lang/StringBuilder::append → KILLED
//
//	 removed call to java/lang/StringBuilder::append → KILLED
//
//	 removed call to java/lang/StringBuilder::append → KILLED
//
//	 removed call to java/lang/StringBuilder::toString → KILLED
//
//	 mutated return of Object value for org/jfree/data/Range::toString to ( if (x != null) null else throw new RuntimeException ) → KILLED
//
//	 replaced call to java/lang/StringBuilder::append with receiver → KILLED
//
//	 replaced call to java/lang/StringBuilder::append with receiver → KILLED
//
//	 replaced call to java/lang/StringBuilder::append with receiver → KILLED
//
//	 replaced call to java/lang/StringBuilder::append with receiver → KILLED
//
//	 Negated double field lower → KILLED
//
//	 Negated double field upper → KILLED
//
//	 Incremented (++a) double field lower → KILLED
//
//	 Incremented (++a) double field upper → KILLED
//
//	 Decremented (--a) double fieldlower → KILLED
//
//	 Decremented (--a) double fieldupper → KILLED

	@Test
	public void testToString() {
		
		
		//setup
		final Range testRange = new Range(4,5);
		String result = testRange.toString();
		String expectedResult = new String("Range[4.0,5.0]");
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	//Killed the following mutants
//	Incremented (++a) double field lower → KILLED
//
//	 Incremented (++a) double field upper → KILLED
//
//	 Decremented (--a) double fieldlower → KILLED
//
//	 Decremented (--a) double fieldupper → KILLED

	@Test
	public void testToStringCallTwice() {
		
		
		//setup
		final Range testRange = new Range(4,5);
		String result = testRange.toString();
		result = testRange.toString();
		String expectedResult = new String("Range[4.0,5.0]");
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	//Tests for getCentralValue()
	
	//Killed the following mutants

//	 Incremented (a++) double field upper → KILLED
//
//	 Incremented (a++) double field lower → KILLED
//
//	 Decremented (a--) double field upper → KILLED
//
//	 Decremented (a--) double field lower → KILLED

	@Test
	public void testGetCentralValueCallTwice() {
		//setup
		final Range testRange = new Range(4, 10);
		double result = testRange.getCentralValue();
		result = testRange.getCentralValue();
		double expectedResult = 7;
		
		//verify
		assertEquals(expectedResult, result, 0.001);
	}
	
	
	//Tests for contains() //DOESN'T WORK YET
	@Test
	public void testContainsIncrementValue() {
		//setup
		final Range testRange = new Range(4, 10.5);
		double testValue = 10;
		boolean result = testRange.contains(testValue);
		result = testRange.contains(testValue);
		boolean expectedResult = true;
		
		//verify
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testContainsDecrementValue() {
		//setup
		final Range testRange = new Range(4, 10.5);
		double testValue = 11;
		boolean result = testRange.contains(testValue);
		result = testRange.contains(testValue);
		boolean expectedResult = false;
		
		//verify
		assertEquals(expectedResult, result);
	}
	
	//Tests for combine(Range, Range)
	//Killed mutant: removed call to org/jfree/data/Range::getLowerBound → KILLED
	@Test
	public void testCombineRemoveLowerBoundCallAndCallTwice() {
		
		//setup
		final Range testRange = new Range(3, 7);
		final Range testRange2 = new Range(3, 7);
		Range result = Range.combine(testRange2, testRange);
		result = Range.combine(testRange2, testRange);
		Range expectedResult = new Range(3, 7);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	//Killed mutant: removed call to org/jfree/data/Range::getUpperBound → KILLED
	@Test
	public void testCombineRemoveUpperBoundCallAndCallTwice() {
		
		//setup
		final Range testRange = new Range(-3, -2);
		final Range testRange2 = new Range(-3, -2);
		Range result = Range.combine(testRange2, testRange);
		result = Range.combine(testRange2, testRange);
		Range expectedResult = new Range(-3, -2);
		
		//verify
		assertEquals(expectedResult, result);
		
		}
	
	//Tests for expand()
	
	//Killed mutant: removed call to org/jfree/chart/util/ParamChecks::nullNotPermitted → KILLED
	@Test (expected = IllegalArgumentException.class)
	public void testExpandException() {
		//setup
		Range testRange = null;
		double lower = 0;
		double upper = -5;
		
		Range.expand(testRange, lower, upper);
	}
	
	//Killed mutant: Negated double local variable number 7 → KILLED
	@Test
	public void testExpandTwice() {
		
		//setup
		final Range testRange = new Range(2,4);
		double lower = 0;
		double upper = -5;
		Range result = Range.expand(testRange, lower, upper);
		Range expectedResult = new Range(-2.0,-2.0);	
		//verify
		assertEquals(expectedResult, result);
			
	}
	//Killed mutant: none yet :D
	@Test
	public void testExpandSameLowerAndUpperRange() {
		
		//setup
		final Range testRange = new Range(4,6);
		double lower = 0;
		double upper = -1;
		Range result = Range.expand(testRange, lower, upper);
		Range expectedResult = new Range(4,4);
		
		//verify
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	public void testExpandSameLowerAndUpperThreeTimes() {
		
		//setup
		final Range testRange = new Range(4,6);
		double lower = 0;
		double upper = -1;
		Range result = Range.expand(testRange, lower, upper);
		result = Range.expand(testRange, lower, upper);
		result = Range.expand(testRange, lower, upper);
		Range expectedResult = new Range(4,4);
		
		//verify
		assertEquals(expectedResult, result);
		
	}
	
	//Tests for expandToInclude()
	
	//Killed mutant:
	@Test
	public void testExpandToIncludeLowerTwice() {
		
		//setup
		final Range testRange = new Range(4,10);
		Range result = Range.expandToInclude(testRange, 0);
		Range.expandToInclude(testRange, 0);
		Range expectedResult = new Range(0,10);
		
		//verify
		assertEquals(expectedResult, result);
			
	}
	
	//Killed mutant:
	@Test
	public void testExpandToIncludeUpperTwice() {
		
		//setup
		final Range testRange = new Range(4,10);
		Range result = Range.expandToInclude(testRange, 15);
		Range.expandToInclude(testRange, 15);
		Range expectedResult = new Range(4,15);
		
		//verify
		assertEquals(expectedResult, result);
		
	}
	
	//Tests for isNaNRange()
	
	@Test
	public void testIsNaNRangeBothNotNaN() {
		
		//setup
		Range testRange =new Range(1, 2);
		//verify
		boolean result = testRange.isNaNRange();
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
	
	@Test
	public void testIsNaNRangeLBNaN() {
		
		//setup
		Range testRange =new Range(Double.NaN, 2);
		//verify
		boolean result = testRange.isNaNRange();
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
	
	@Test
	public void testIsNaNRangeUBNaN() {
		
		//setup
		Range testRange =new Range(1, Double.NaN);
		//verify
		boolean result = testRange.isNaNRange();
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
	
	@Test
	public void testIsNaNRangeBothTwice() {
		
		//setup
		Range testRange =new Range(Double.NaN, Double.NaN);
		//verify
		boolean result = testRange.isNaNRange();
		result = testRange.isNaNRange();
		boolean expected = true;
		
		//verify
		assertEquals(expected, result);
	}
	
	@Test
	public void testIsNaNRangeNoneTwice() {
		
		//setup
		Range testRange =new Range(1, 1);
		//verify
		boolean result = testRange.isNaNRange();
		result = testRange.isNaNRange();
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
	
	//Professor's Sample Test Code from org.jfree.data.test
	
	/**
     * Confirm that the constructor initializes all the required fields.
     */
    @Test
    public void testConstructor() {
        Range r1 = new Range(0.1, 1000.0);
        assertEquals(r1.getLowerBound(), 0.1, 0.0d);
        assertEquals(r1.getUpperBound(), 1000.0, 0.0d);

        try {
            /*Range r2 =*/ new Range(10.0, 0.0);
            fail("Lower bound cannot be greater than the upper");
        }
        catch (Exception e) {
            // expected
        }
    }
    
    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    @Test
    public void testEquals() {
        Range r1 = new Range(0.0, 1.0);
        Range r2 = new Range(0.0, 1.0);
        assertEquals(r1, r2);
        assertEquals(r2, r1);

        r1 = new Range(0.0, 1.0);
        r2 = new Range(0.5, 1.0);
        assertFalse(r1.equals(r2));

        r1 = new Range(0.0, 1.0);
        r2 = new Range(0.0, 2.0);
        assertFalse(r1.equals(r2));

        // a Range object cannot be equal to a different object type
        assertFalse(r1.equals(new Double(0.0)));
    }

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    @Test
    public void testHashCodeSample() {
        Range a1 = new Range(1.0, 100.0);
        Range a2 = new Range(1.0, 100.0);
        assertEquals(a1.hashCode(), a2.hashCode());

        a1 = new Range(-100.0, 2.0);
        a2 = new Range(-100.0, 2.0);
        assertEquals(a1.hashCode(), a2.hashCode());
    }
 

    /**
     * Simple tests for the contains() method.
     */
//    @Test
    public void testContains() {
        Range r1 = new Range(0.0, 1.0);
        assertFalse(r1.contains(Double.NaN));
        assertFalse(r1.contains(Double.NEGATIVE_INFINITY));
        assertFalse(r1.contains(-1.0));
        assertTrue(r1.contains(0.0));
        assertTrue(r1.contains(0.5));
        assertTrue(r1.contains(1.0));
        assertFalse(r1.contains(2.0));
        assertFalse(r1.contains(Double.POSITIVE_INFINITY));
    }
    

    /**
     * Tests the constrain() method for various values.
     */
    @Test
    public void testConstrain() {
        Range r1 = new Range(0.0, 1.0);

        double d = r1.constrain(0.5);
        assertEquals(0.5, d, 0.0000001);

        d = r1.constrain(0.0);
        assertEquals(0.0, d, 0.0000001);

        d = r1.constrain(1.0);
        assertEquals(1.0, d, 0.0000001);

        d = r1.constrain(-1.0);
        assertEquals(0.0, d, 0.0000001);

        d = r1.constrain(2.0);
        assertEquals(1.0, d, 0.0000001);

        d = r1.constrain(Double.POSITIVE_INFINITY);
        assertEquals(1.0, d, 0.0000001);

        d = r1.constrain(Double.NEGATIVE_INFINITY);
        assertEquals(0.0, d, 0.0000001);

        d = r1.constrain(Double.NaN);
        assertTrue(Double.isNaN(d));
    }
    

    /**
     * Simple tests for the intersects() method.
     */
    @Test
    public void testIntersects() {
        Range test1 = new Range(0.0, 1.0);
        assertFalse(test1.intersects(-2.0, -1.0));
        assertFalse(test1.intersects(-2.0, 0.0));
        assertTrue(test1.intersects(-2.0, 0.5));
        assertTrue(test1.intersects(-2.0, 1.0));
        assertTrue(test1.intersects(-2.0, 1.5));
        assertTrue(test1.intersects(0.0, 0.5));
        assertTrue(test1.intersects(0.0, 1.0));
        assertTrue(test1.intersects(0.0, 1.5));
        assertTrue(test1.intersects(0.5, 0.6));
        assertTrue(test1.intersects(0.5, 1.0));
        assertTrue(test1.intersects(0.5, 1.5));
        assertFalse(test1.intersects(1.0, 1.1));
        assertFalse(test1.intersects(1.5, 2.0));
    }

    /**
     * A simple test for the expand() method.
     */
    @Test
    public void testExpandSample() {
        Range r1 = new Range(0.0, 100.0);
        Range r2 = Range.expand(r1, 0.10, 0.10);
        assertEquals(-10.0, r2.getLowerBound(), 0.001);
        assertEquals(110.0, r2.getUpperBound(), 0.001);

        // Expand by 0% does not change the range
        r2 = Range.expand(r1, 0.0, 0.0);
        assertEquals(r1, r2);

        try {
            Range.expand(null, 0.1, 0.1);
            fail("Null value is accepted");
        }
        catch (Exception e) {
        }

        // Lower > upper: mid point is used
        r2 = Range.expand(r1, -0.8, -0.5);
        assertEquals(65.0, r2.getLowerBound(), 0.001);
        assertEquals(65.0, r2.getUpperBound(), 0.001);
    }
    

    /**
     * A simple test for the scale() method.
     */
    @Test
    public void testShift() {
        Range r1 = new Range(10.0, 20.0);
        Range r2 = Range.shift(r1, 20.0);
        assertEquals(30.0, r2.getLowerBound(), 0.001);
        assertEquals(40.0, r2.getUpperBound(), 0.001);

        r1 = new Range(0.0, 100.0);
        r2 = Range.shift(r1, -50.0, true);
        assertEquals(-50.0, r2.getLowerBound(), 0.001);
        assertEquals(50.0, r2.getUpperBound(), 0.001);

        r1 = new Range(-10.0, 20.0);
        r2 = Range.shift(r1, 20.0, true);
        assertEquals(10.0, r2.getLowerBound(), 0.001);
        assertEquals(40.0, r2.getUpperBound(), 0.001);

        r1 = new Range(-10.0, 20.0);
        r2 = Range.shift(r1, -30.0, true);
        assertEquals(-40.0, r2.getLowerBound(), 0.001);
        assertEquals(-10.0, r2.getUpperBound(), 0.001);

        r1 = new Range(-10.0, 20.0);
        r2 = Range.shift(r1, 20.0, false);
        assertEquals(0.0, r2.getLowerBound(), 0.001);
        assertEquals(40.0, r2.getUpperBound(), 0.001);

        r1 = new Range(-10.0, 20.0);
        r2 = Range.shift(r1, -30.0, false);
        assertEquals(-40.0, r2.getLowerBound(), 0.001);
        assertEquals(0.0, r2.getUpperBound(), 0.001);

        // Shifting with a delta of 0 does not change the range
        r2 = Range.shift(r1, 0.0);
        assertEquals(r1, r2);

        try {
            Range.shift(null, 0.1);
            fail("Null value is accepted");
        }
        catch (Exception e) {
        }
    }

    /**
     * A simple test for the scale() method.
     */
    @Test
    public void testScale() {
        Range r1 = new Range(0.0, 100.0);
        Range r2 = Range.scale(r1, 0.10);
        assertEquals(0.0, r2.getLowerBound(), 0.001);
        assertEquals(10.0, r2.getUpperBound(), 0.001);

        r1 = new Range(-10.0, 100.0);
        r2 = Range.scale(r1, 2.0);
        assertEquals(-20.0, r2.getLowerBound(), 0.001);
        assertEquals(200.0, r2.getUpperBound(), 0.001);

        // Scaling with a factor of 1 does not change the range
        r2 = Range.scale(r1, 1.0);
        assertEquals(r1, r2);

        try {
            Range.scale(null, 0.1);
            fail("Null value is accepted");
        }
        catch (Exception e) {
        }

        try {
            Range.scale(r1, -0.5);
            fail("Negative factor accepted");
        }
        catch (Exception e) {
        }
    }

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the combine method.
     */
    @Test
    public void testCombine() {
        Range r1 = new Range(1.0, 2.0);
        Range r2 = new Range(1.5, 2.5);

        assertNull(Range.combine(null, null));
        assertEquals(r1, Range.combine(r1, null));
        assertEquals(r2, Range.combine(null, r2));
        assertEquals(new Range(1.0, 2.5), Range.combine(r1, r2));

        Range r3 = new Range(Double.NaN, 1.3);
        Range rr = Range.combine(r1, r3);
        assertTrue(Double.isNaN(rr.getLowerBound()));
        assertEquals(2.0, rr.getUpperBound(), EPSILON);

        Range r4 = new Range(1.7, Double.NaN);
        rr = Range.combine(r4, r1);
        assertEquals(1.0, rr.getLowerBound(), EPSILON);
        assertTrue(Double.isNaN(rr.getUpperBound()));
    }

    /**
     * Some checks for the combineIgnoringNaN() method.
     */
    @Test
    public void testCombineIgnoringNaN() {
        Range r1 = new Range(1.0, 2.0);
        Range r2 = new Range(1.5, 2.5);

        assertNull(Range.combineIgnoringNaN(null, null));
        assertEquals(r1, Range.combineIgnoringNaN(r1, null));
        assertEquals(r2, Range.combineIgnoringNaN(null, r2));
        assertEquals(new Range(1.0, 2.5), Range.combineIgnoringNaN(r1, r2));

        Range r3 = new Range(Double.NaN, 1.3);
        Range rr = Range.combineIgnoringNaN(r1, r3);
        assertEquals(1.0, rr.getLowerBound(), EPSILON);
        assertEquals(2.0, rr.getUpperBound(), EPSILON);

        Range r4 = new Range(1.7, Double.NaN);
        rr = Range.combineIgnoringNaN(r4, r1);
        assertEquals(1.0, rr.getLowerBound(), EPSILON);
        assertEquals(2.0, rr.getUpperBound(), EPSILON);
    }
    
    @Test
    public void testIsNaNRangeDouble() {
        assertTrue(new Range(Double.NaN, Double.NaN).isNaNRange());
        assertFalse(new Range(1.0, 2.0).isNaNRange());
        assertFalse(new Range(Double.NaN, 2.0).isNaNRange());
        assertFalse(new Range(1.0, Double.NaN).isNaNRange());
    }
	
}
