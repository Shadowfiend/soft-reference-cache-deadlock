package main.scala {
  import net.liftweb.util.SoftReferenceCache

  object Test extends App {
    println("And here we go...")

    val cache = SoftReferenceCache[String,Any](10)

    cache += ("boom" -> new Object)
    cache += ("bam" -> new Object)

    // Force SoftReference eviction.
    try {
      val ignored = new Array[Object](Runtime.getRuntime().maxMemory().toInt);
    } catch {
      case _ =>
    }

    println(cache("boom"))
    println(cache("bam"))
  }
}
