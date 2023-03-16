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
		boolean result = testRange.intersects(2,3);
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
	
	@Test
	public void testIntersectsWhenLowerBoundDecremented() {
		
		//setup 
		final Range testRange = new Range(1,1);
		boolean result = testRange.intersects(-1,0);
		boolean expected = false;
		
		//verify
		assertEquals(expected, result);
	}
}
