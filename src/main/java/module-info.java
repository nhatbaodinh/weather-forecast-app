module dinhnhatbao.weatherforecast {
  requires org.json;
  requires javafx.web;
  requires java.net.http;
  requires javafx.fxml;
  requires javafx.controls;
  requires javafx.graphics;
  requires javafx.base;
  requires java.desktop;


  opens dinhnhatbao.weatherforecast to javafx.fxml;
  exports dinhnhatbao.weatherforecast;
}