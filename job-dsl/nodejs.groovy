job('NodeJS example') {
    scm {
        git('git://github.com/pika-3kw/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('Giang Nam')
            node / gitConfigEmail('giangnam10a2@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
