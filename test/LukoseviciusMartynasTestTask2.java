package test;

import cm.CarParkKind;
import cm.Period;
import cm.Rate;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LukoseviciusMartynasTestTask2 {

    @Test(expected = IllegalArgumentException.class)
    public void normalRateNotNull() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = null;
        BigDecimal reducedRate = BigDecimal.valueOf(6);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(1, 7);
        Period normalPeriod = new Period(8, 24);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void reducedRateNotNull() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(5);
        BigDecimal reducedRate = null;

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(1, 7);
        Period normalPeriod = new Period(8, 24);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void normalPeriodsNotNull() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = null;

        Period reducedPeriod = new Period(1, 7);

        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void reducedPeriodsNotNull() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = null;
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(1, 7);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void normalRateNotNegative() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(-5);
        BigDecimal reducedRate = BigDecimal.valueOf(6);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(1, 7);
        Period normalPeriod = new Period(8, 24);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void reducedRateNotNegative() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(5);
        BigDecimal reducedRate = BigDecimal.valueOf(-6);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(1, 7);
        Period normalPeriod = new Period(8, 24);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void reducedPeriodStartHourNotNegative() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(-1, 7);
        Period normalPeriod = new Period(8, 24);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void reducedPeriodEndHourNotGreaterThan24() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(13, 25);
        Period normalPeriod = new Period(1, 12);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void normalPeriodStartHourNotNegative() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(13, 14);
        Period normalPeriod = new Period(-1, 12);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void normalPeriodEndHourNotGreaterThan24() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(1, 20);
        Period normalPeriod = new Period(21, 25);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void reducedPeriodStartHourLessThanEndHour() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(13, 11);
        Period normalPeriod = new Period(1, 9);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void normalPeriodStartHourLessThanEndHour() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(1, 8);
        Period normalPeriod = new Period(10, 9);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void normalRateLessThanReducedRate() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(5);
        BigDecimal reducedRate = BigDecimal.valueOf(6);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(1, 8);
        Period normalPeriod = new Period(9, 10);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void reducedPeriodsOverlap() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod1 = new Period(7, 10);
        Period reducedPeriod2 = new Period(8, 12);

        Period normalPeriod = new Period(12, 13);

        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void normalPeriodsOverlap() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(5);
        BigDecimal reducedRate = BigDecimal.valueOf(4);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(7, 10);
        Period normalPeriod2 = new Period(8, 12);

        Period reducedPeriod = new Period(12, 13);

        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void normalAndReducedPeriodsOverlap() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(5);
        BigDecimal reducedRate = BigDecimal.valueOf(4);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(7, 10);
        Period reducedPeriod = new Period(8, 12);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void periodStayIsNull() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(7, 10);
        Period normalPeriod2 = new Period(10, 14);
        Period reducedPeriod = new Period(14, 19);
        Period periodStay = null;

        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        rate.calculate(periodStay);
    }

    @Test
    public void calculatesCorrectForNormalPeriod() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(7, 15);
        Period reducedPeriod = new Period(16, 24);
        Period periodStay = new Period(8, 14);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        BigDecimal expectedCharge = BigDecimal.valueOf(36);
        assertEquals(rate.calculate(periodStay), expectedCharge);
    }

    @Test
    public void calculatesCorrectForReducedPeriod() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(7, 15);
        Period reducedPeriod = new Period(16, 24);
        Period periodStay = new Period(16, 20);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        BigDecimal expectedCharge = BigDecimal.valueOf(20);
        assertEquals(rate.calculate(periodStay), expectedCharge);
    }

    @Test
    public void calculatesCorrectForNormalAndReducedPeriods() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(7, 15);
        Period reducedPeriod = new Period(15, 24);
        Period periodStay = new Period(12, 21);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        BigDecimal expectedCharge = BigDecimal.valueOf(48);
        assertEquals(rate.calculate(periodStay), expectedCharge);
    }

    @Test
    public void calculatesZeroWhenFreeStay() {
        CarParkKind carParkKind = CarParkKind.STUDENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(7, 15);
        Period reducedPeriod = new Period(15, 24);
        Period periodStay = new Period(1, 6);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        BigDecimal expectedCharge = BigDecimal.valueOf(0);
        assertEquals(rate.calculate(periodStay), expectedCharge);
    }

    @Test
    public void calculatesAmountWithNormalAndFreePeriods() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(7, 15);
        Period reducedPeriod = new Period(15, 24);
        Period periodStay = new Period(3, 10);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        BigDecimal expectedCharge = BigDecimal.valueOf(18);
        assertEquals(rate.calculate(periodStay), expectedCharge);
    }

    @Test
    public void calculatesAmountWithReducedAndFreePeriods() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(7, 11);
        Period reducedPeriod = new Period(15, 24);
        Period periodStay = new Period(12, 19);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        BigDecimal expectedCharge = BigDecimal.valueOf(20);
        assertEquals(rate.calculate(periodStay), expectedCharge);
    }

    @Test
    public void calculatesCorrectWithReducedNormalFreePeriods() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(7, 11);
        Period reducedPeriod = new Period(11, 24);
        Period periodStay = new Period(1, 24);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        BigDecimal expectedCharge = BigDecimal.valueOf(89);
        assertEquals(rate.calculate(periodStay), expectedCharge);
    }

    @Test(expected = IllegalArgumentException.class)
    public void periodsOverlapInternally() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod1 = new Period(1, 5);
        Period reducedPeriod2 = new Period(4, 7);
        Period reducedPeriod3 = new Period(6, 13);
        Period normalPeriod1 = new Period(12, 16);
        Period normalPeriod2 = new Period(15, 20);
        Period normalPeriod3 = new Period(19, 23);

        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);
        reducedPeriods.add(reducedPeriod3);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test
    public void periodsDoNotOverlap() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod1 = new Period(1, 5);
        Period reducedPeriod2 = new Period(5, 7);
        Period reducedPeriod3 = new Period(7, 12);
        Period normalPeriod1 = new Period(12, 16);
        Period normalPeriod2 = new Period(16, 20);
        Period normalPeriod3 = new Period(20, 23);

        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);
        reducedPeriods.add(reducedPeriod3);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void periodsOverlapExternally() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(6);
        BigDecimal reducedRate = BigDecimal.valueOf(5);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod1 = new Period(1, 5);
        Period reducedPeriod2 = new Period(2, 5);
        Period reducedPeriod3 = new Period(3, 5);
        Period normalPeriod1 = new Period(4, 5);
        Period normalPeriod2 = new Period(5, 5);
        Period normalPeriod3 = new Period(5, 5);

        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);
        reducedPeriods.add(reducedPeriod3);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void reducedAndNormalOverlapMultiplePeriods() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(5);
        BigDecimal reducedRate = BigDecimal.valueOf(2);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(0, 3);
        Period normalPeriod2 = new Period(4, 6);
        Period normalPeriod3 = new Period(7, 9);
        Period reducedPeriod = new Period(8, 12);
        Period reducedPeriod2 = new Period(13, 15);
        Period reducedPeriod3 = new Period(16, 21);

        normalPeriods.add(normalPeriod);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);
        reducedPeriods.add(reducedPeriod);
        reducedPeriods.add(reducedPeriod2);
        reducedPeriods.add(reducedPeriod3);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test
    public void normalRateIsZero() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(0);
        BigDecimal reducedRate = BigDecimal.valueOf(0);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(1, 5);
        Period normalPeriod = new Period(5, 6);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test
    public void reducecdRateIsZero() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(1);
        BigDecimal reducedRate = BigDecimal.valueOf(0);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period reducedPeriod = new Period(1, 5);
        Period normalPeriod = new Period(5, 6);

        reducedPeriods.add(reducedPeriod);
        normalPeriods.add(normalPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Test
    public void visitorChargeLessThanOrEqual8() {
        CarParkKind carParkKind = CarParkKind.VISITOR;
        BigDecimal normalRate = BigDecimal.valueOf(1);
        BigDecimal reducedRate = BigDecimal.valueOf(1);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(9, 16);
        Period reducedPeriod = new Period(16, 20);
        Period periodStay = new Period(9, 14);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expected = BigDecimal.ZERO;
        assertEquals(rate.calculate(periodStay), expected);
    }

    @Test
    public void visitorChargeEqual8() {
        CarParkKind carParkKind = CarParkKind.VISITOR;
        BigDecimal normalRate = BigDecimal.valueOf(2);
        BigDecimal reducedRate = BigDecimal.valueOf(1);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(9, 16);
        Period reducedPeriod = new Period(16, 20);
        Period periodStay = new Period(9, 13);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expected = BigDecimal.ZERO;
        assertEquals(rate.calculate(periodStay), expected);
    }

    @Test
    public void visitorChargeGreaterThan8() {
        CarParkKind carParkKind = CarParkKind.VISITOR;
        BigDecimal normalRate = BigDecimal.valueOf(3);
        BigDecimal reducedRate = BigDecimal.valueOf(1);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(9, 16);
        Period reducedPeriod = new Period(16, 20);
        Period periodStay = new Period(9, 13);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expected = BigDecimal.valueOf(2);
        assertEquals(rate.calculate(periodStay), expected);
    }

    @Test
    public void managementChargeLessThanOrEqual3() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(0.5);
        BigDecimal reducedRate = BigDecimal.valueOf(0);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(9, 16);
        Period reducedPeriod = new Period(16, 20);
        Period periodStay = new Period(9, 13);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expected = BigDecimal.valueOf(3);
        assertEquals(rate.calculate(periodStay), expected);
    }

    @Test
    public void managementChargeEqual3() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(0.5);
        BigDecimal reducedRate = BigDecimal.valueOf(0);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(9, 16);
        Period reducedPeriod = new Period(16, 20);
        Period periodStay = new Period(9, 15);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expected = BigDecimal.valueOf(3);
        assertEquals(rate.calculate(periodStay), expected);
    }

    @Test
    public void managementChargeGreaterThan3() {
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = BigDecimal.valueOf(2);
        BigDecimal reducedRate = BigDecimal.valueOf(1);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();

        Period normalPeriod = new Period(9, 16);
        Period reducedPeriod = new Period(16, 20);
        Period periodStay = new Period(9, 13);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        Rate rate = new Rate(carParkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal expected = BigDecimal.valueOf(8);
        assertEquals(rate.calculate(periodStay), expected);
    }
}