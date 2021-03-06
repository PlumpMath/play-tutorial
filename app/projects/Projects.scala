package projects

import play.api.libs.json.{Json, JsString, JsPath, Writes}
import play.api.libs.functional.syntax._

case class Project(projectName: String)

object Project {
  implicit val projectWrites: Writes[Project] = Writes{
    (project: Project) => Json.obj("projectName" -> project.projectName)
  }
}



