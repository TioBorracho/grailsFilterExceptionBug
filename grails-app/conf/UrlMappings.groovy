class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		
		"500" (controller: "error", action: "handleException", exception: Exception)
		"404" (controller: "error", action: "handleException", exception: Exception )
		
		
	}
}
