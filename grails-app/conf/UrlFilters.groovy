import org.apache.commons.logging.LogFactory
import org.omg.CosNaming.NamingContextExtPackage.InvalidAddress

class UrlFilters {
	
	private static final log = LogFactory.getLog(this)
	
	/**
	 * This will take the annotated controller and ensure that it correctly enforces security.
	 * This depends on request._apiUser being present for the filter
	 */
	
	def filters = {
		
		test(controller:'*', action:'*') {
			before = {
				
				println '#########################'
				println '## controller : ' + controllerName + " ## actionName : " + actionName + " ## ID : " + params.id + " ##"
				println '#########################'
				
				if (controllerName != 'error') {
					throw new LalaException("foo")
					//throw new InvalidActivityException("BLA")
				}
			}
		}
	}
}
