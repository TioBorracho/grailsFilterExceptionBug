package testmethodnamenotnullissue

class ErrorController {

    def handleException() {
		
		println "################################################" 
		println request.exception
		println request.exception.cause
		println "################################################"
	}
}
