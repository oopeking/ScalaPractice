package week7

object SetTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  val set = Set(2, 1, 2, 3, 3);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(11); val res$0 = 
  set.size;System.out.println("""res0: Int = """ + $show(res$0));$skip(21); 
  val set2 = set + 4;System.out.println("""set2  : scala.collection.immutable.Set[Int] = """ + $show(set2 ));$skip(33); 
  val set3 = set ++ Set(5, 6, 7);System.out.println("""set3  : scala.collection.immutable.Set[Int] = """ + $show(set3 ))}
}
