package controllers

import javax.inject._

import com.typesafe.config.ConfigFactory
import play.api.Logger
import play.api.Play.current
import play.api.data.Forms._
import play.api.data._
import play.api.i18n.Messages.Implicits._
import play.api.mvc._

import scala.concurrent.ExecutionContext.Implicits.global

class Home extends Controller {
  def index = Action {
    Ok(views.html.home.index())
  }

  def about = Action {
    Ok(views.html.home.about())
  }

  def contact = Action {
    Ok(views.html.home.contact())
  }
}

