package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.login("My new application is ready."))
  }

  def login = Action {
    Ok(views.html.menu("Masahiro"))
  }
  
}