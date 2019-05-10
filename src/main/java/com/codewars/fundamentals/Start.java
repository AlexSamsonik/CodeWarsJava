package com.codewars.fundamentals;

import com.codewars.fundamentals.word.BinaryRegexp;

public class Start {

    public static void main(String[] args) {

//        // Vowels
//        System.out.println(Vowels.getCount("Hello, privet, hi"));

//        // FakeBinary
//        System.out.println(FakeBinary.fakeBin("0976"));

//        // CalculateAverage
//        int[] numbersCalculateAverage = {2, 5, 7, 8, 3, 0};
//        System.out.println(CalculateAverage.find_average(numbersCalculateAverage));

//        // RockPaperScissors
//        System.out.println(RockPaperScissors.rps("scissors", "paper"));

//        // Reverse
//        System.out.println(Reverse.digitize(12161789));

//        // Sum of positive
//        int[] numbersSumOfPositive = {-2, 2, 7, 8, 3, -10};
//        System.out.println(Summa.sumOfPositive(numbersSumOfPositive));

//        // Ones and Zeros
//        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,1,1,1))));

//        // Beginner Series #3 Sum of Numbers
//        System.out.println(Summa.getSum(-1, -3));

//        // Decode the Morse code
//        System.out.println(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));

//        //Two fighters, one winner.
//        Fighter fighter1 = new Fighter("Java",10,2);
//        Fighter fighter2 = new Fighter("C#",10,2);
//        System.out.println(Winner.declareWinner(fighter1,fighter2,"Java"));

//        // Supermarket Queue
//        System.out.println(SupermarketQueue.solveSuperMarketQueue(new int[] {2,10,10,3,4,5,1},3));

//        // Number of people in the bus
//        ArrayList<int[]> list = new ArrayList<>();
//        list.add(new int[] {10,0});
//        list.add(new int[] {3,5});
//        list.add(new int[] {2,5});
//        System.out.println(Metro.countPassengers(list));

//        // Flatten and sort an array
//        SortArray.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}});

//        // Counting sheep...
//        Boolean[] array1 = {true, true, true, false,
//                true, true, true, true,
//                true, false, true, null,
//                true, false, false, true,
//                true, null, true, true,
//                false, false, true, true};
//        System.out.println(Sheeps.countSheeps(array1));

//        // Take a Number And Sum Its Digits Raised To The Consecutive Powers
//        long startTime = System.currentTimeMillis();
//        System.out.println(SumDigPower.sumDigPow(1,25000000));
//        long stopTime = System.currentTimeMillis();
//        System.out.println((double)(stopTime - startTime)/1000);

//        // Find the unique number
//        UniqueNumber.findUnique(new double[]{1, 2, 2});

//        // Consecutive strings
//        System.out.println(LongestConsecutive.longestConsec(new String[]{"zone", "abigail", "theta"}, 2));

//        // Multiples of 3 or 5
//        System.out.println(new Solution().solution(20));

//        // Find the odd int
//        System.out.println(FindOdd.findIt(new int[]{20}));

//        // Create Phone Number
//        System.out.println(Phone.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));

//        // Sum of Digits/Digital Root
//        int number = 117408879;
//        DRoot dRoot = new DRoot();
//
//        long startTime = System.nanoTime();
//        dRoot.digitalRoot(number);
//        long stopTime = System.nanoTime();
//        System.out.println("MyTime is equals " + (stopTime - startTime));
//
//        long startTimeB = System.nanoTime();
//        dRoot.digital_root(number);
//        long stopTimeB = System.nanoTime();
//        System.out.println("CodeWars time is equals " + (stopTimeB - startTimeB));

//        // Persistent Bugger
//        System.out.println(Persist.persistence(25));

//        // Find The Parity Outlier
//        System.out.println(FindOutlier.find(new int[] {2,6,8,-10,3}));

//        // Playing with digits
//        System.out.println(DigPow.digPow(46288, 3));

//        // Dubstep
//        System.out.println(Dubstep.SongDecoder("WUBWUBABCWUB"));

//        // Your order, please
//        System.out.println(Order.order("is2 Thi1s T4est 3a"));

//        // Stop gninnipS My sdroW!
//        SpinWords spinWords = new SpinWords();
//        System.out.println(spinWords.spinWords("Hey fellow warriors"));

//        // Count the smiley faces!
//        List<String> smiles = new ArrayList<>();
//        smiles.add(";-)");
//        smiles.add(":))");
//        smiles.add(":-(");
//        System.out.println(SmileFaces.countSmileys(smiles));

//        // Detect Pangram
//        PangramChecker pangramChecker = new PangramChecker();
//        System.out.println(pangramChecker.check("The quick brown fox jumps over the lazy dog"));

        System.out.println("BinaryRegexp doesn't working. Return value is " + BinaryRegexp.multipleOf3().matcher("000").matches());
    }
}