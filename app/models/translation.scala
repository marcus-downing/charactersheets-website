package models

import java.io.File
import scala.io.Source
import play.api.libs.json._

object TranslationData {
	// def load(): TranslationData = {
		
	// }
}

case class TranslationData (
	translations: List[Translation]
) {
	def getTranslation(original: String, partOf: String): Option[Translation] = {
		translations.filter(t => t.original == original && t.partOf == partOf).headOption
	}
}

case class Translation (original: String, partOf: String, translation: String)