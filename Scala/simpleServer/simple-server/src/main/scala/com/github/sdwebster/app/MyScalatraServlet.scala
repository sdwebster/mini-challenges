package com.github.sdwebster.app

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends SimpleServerStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        <h2>This is your server speaking. We are using Sinatra!<h2>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
