package week4
import scala.collection.immutable._

object ScalaListTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(95); 
  val empty = List();System.out.println("""empty  : List[Nothing] = """ + $show(empty ));$skip(37); 
  val strList = List("fang", "chao");System.out.println("""strList  : List[String] = """ + $show(strList ));$skip(15); val res$0 = 
  strList.head;System.out.println("""res0: String = """ + $show(res$0));$skip(30); 
  val numList = List(1, 2, 3);System.out.println("""numList  : List[Int] = """ + $show(numList ));$skip(15); val res$1 = 
  numList.tail;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(40); 
  val numList2 = 4 :: (5 :: (6 :: Nil));System.out.println("""numList2  : List[Int] = """ + $show(numList2 ));$skip(36); 
  val numList3 = 1 :: 2 :: 3 :: Nil;System.out.println("""numList3  : List[Int] = """ + $show(numList3 ));$skip(39); 
  val numList4 = Nil.::(3).::(2).::(1);System.out.println("""numList4  : List[Int] = """ + $show(numList4 ));$skip(33); 
  val numList5 = 100 :: numList3;System.out.println("""numList5  : List[Int] = """ + $show(numList5 ));$skip(21); val res$2 = 
  numList5.tail.tail;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(91); 
  //Please compare :: and :::
  //::
  val numList6 = List(101, 102, 103, 104) :: numList3;System.out.println("""numList6  : List[Any] = """ + $show(numList6 ));$skip(16); val res$3 = 
  numList6.head;System.out.println("""res3: Any = """ + $show(res$3));$skip(16); val res$4 = 
  numList6.tail;System.out.println("""res4: List[Any] = """ + $show(res$4));$skip(60); 
  
  //:::
  val numList66=List(101,102,103,104):::numList3;System.out.println("""numList66  : List[Int] = """ + $show(numList66 ));$skip(17); val res$5 = 
  numList66.head;System.out.println("""res5: Int = """ + $show(res$5));$skip(17); val res$6 = 
  numList66.tail;System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(17); val res$7 = 
  
  empty.head;System.out.println("""res7: Nothing = """ + $show(res$7))}
}
