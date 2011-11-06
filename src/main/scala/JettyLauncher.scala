import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.{DefaultServlet, ServletContextHandler}
import java.util.EnumSet
import javax.servlet.DispatcherType

object JettyLauncher {
  def main(args: Array[String]) {
    val port = if(System.getenv("PORT") != null) System.getenv("PORT").toInt else 8080
    val DefaultDispatcherTypes: EnumSet[DispatcherType] =
        EnumSet.of(DispatcherType.REQUEST, DispatcherType.ASYNC)

    val server = new Server(port)
    val context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS)

    context.addFilter(classOf[CiderEndpointFilter], "/*", DefaultDispatcherTypes)
    context.addServlet(classOf[DefaultServlet], "/")
    context.setResourceBase("src/main/webapp")

    server.start
    server.join
  }

}

