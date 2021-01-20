// restrict individual repository Jenkinsfiles
allow_scm_jenkinsfile = false
// skip the default JTE checkout and do it explicitly
skip_default_checkout = false
// define application environment objects
application_environments{
    dev{
        long_name = "Development"
    }
    prod{
        long_name = "Production"
    }
}

/*
  define libraries to load.
  available libraries are based upon the
  library sources configured.
*/
libraries{
    git
    maven
    docker
    aws
    sonarqube
    unittest
}