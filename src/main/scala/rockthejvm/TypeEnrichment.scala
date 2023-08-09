package rockthejvm

import java.nio.charset.Charset
import java.util.Base64

object TypeEnrichment extends App {

  trait Encoder[T] {
    def encode(value: T): Option[Array[Byte]]
  }

  trait Decode[T] {
    def decode(bytes: Array[Byte]): Option[Array[T]]
  }


  object JsonCodec {
    def encode[T](value: T)(implicit encoder: Encoder[T]) = {

    }

    def decode[T](array: Array[Byte])(decode: Decode[T]) = {

    }
  }


}
