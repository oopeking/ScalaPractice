package idealized

import swing._

class HelloFrame extends Frame {
  title = "First program"
  contents = new Label("Hello, world!")
}

object Hello {
  val frame = new HelloFrame
  def main(args: Array[String]): Unit = {
    frame.visible = true
  }
}