grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.repos.'crs'.url = "http://mvn.newgenesys.com/content/repositories/crs"
grails.project.repos.default = "crs"
grails.project.repos.'crs'.username = "pdemilly"
grails.project.repos.'crs'.password = "deploy/me"


grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    legacyResolve false // whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility
    repositories {
        //grailsCentral()
        //mavenCentral()
        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        //mavenLocal()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
        mavenRepo "http://mvn.newgenesys.com/content/groups/crs-framework"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.21'
    }

    plugins {
        build(":release:3.0.1",
              ":rest-client-builder:1.0.3") {
            export = false
        }
	runtime ":crs-core-domain:0.8.1"
	runtime ":crs-ui:0.8"
	runtime ":crs-security:0.8"
	// runtime ":crs-calendar:0.8"
	// runtime ":crs-doc-mgmt:0.8"
	// runtime ":crs-pdf-form:0.8"
	// runtime ":crs-blog:0.8"
	runtime ":crs-email:0.8"
	// runtime ":crs-task:0.8"
	// runtime ":crs-repo-local-filesystem:0.8"
	// runtime ":crs-issue-tracking:0.8"
    }
}

//grails.plugin.location.'crs-scoped-proxy' = '../wep-project/grails-scoped-proxy'
