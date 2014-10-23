package week5

object worksheetTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  val part1List = 1 :: 0 :: 19 :: Nil;System.out.println("""part1List  : List[Int] = """ + $show(part1List ));$skip(41); 
  val part2List = -23 :: 137 :: 5 :: Nil;System.out.println("""part2List  : List[Int] = """ + $show(part2List ));$skip(84); 
  //Create a new list, we could also use :::
  val numList = part1List ++ part2List;System.out.println("""numList  : List[Int] = """ + $show(numList ));$skip(39); val res$0 = 
  //Reverse the list
  numList.reverse;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(89); val res$1 = 
  //Update the element at certain index, others retain the same
  numList updated (2, 2);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(24); val res$2 = 
  numList.updated(3, 2);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(40); val res$3 = 
  //Basic method in List
  numList.head;System.out.println("""res3: Int = """ + $show(res$3));$skip(15); val res$4 = 
  numList.tail;System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(62); val res$5 = 
  //Remember scala list has the 0 index
  numList.indexOf(19);System.out.println("""res5: Int = """ + $show(res$5));$skip(23); val res$6 = 
  numList.indexOf(100);System.out.println("""res6: Int = """ + $show(res$6));$skip(24); val res$7 = 
  numList.contains(100);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(23); val res$8 = 
  numList.contains(19);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(51); val res$9 = 
  //Task 4 element from the list
  numList.take(4);System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(86); val res$10 = 
  //Return the remaian elements after we remove the first 3 element
  numList.drop(3);System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(17); val res$11 = 
  numList.length;System.out.println("""res11: Int = """ + $show(res$11));$skip(58); val res$12 = 
  //Return the element except the last one
  numList.init;System.out.println("""res12: List[Int] = """ + $show(res$12));$skip(15); val res$13 = 
  numList.last;System.out.println("""res13: Int = """ + $show(res$13));$skip(70); 
  //SplitAt method
  val (firstPart, secondPart) = numList.splitAt(4);System.out.println("""firstPart  : List[Int] = """ + $show(firstPart ));System.out.println("""secondPart  : List[Int] = """ + $show(secondPart ));$skip(10); val res$14 = 
  numList;System.out.println("""res14: List[Int] = """ + $show(res$14));$skip(13); val res$15 = 
  numList(2);System.out.println("""res15: Int = """ + $show(res$15));$skip(46); val res$16 = 
  //Please this two functions
  List().length;System.out.println("""res16: Int = """ + $show(res$16));$skip(13); val res$17 = 
  Nil.length;System.out.println("""res17: Int = """ + $show(res$17))}
}
