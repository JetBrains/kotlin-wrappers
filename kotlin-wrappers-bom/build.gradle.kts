plugins {
    `java-platform`
    `publish-conventions`
}

dependencies {
    constraints {
        api(project(":kotlin-css"))
        api(project(":kotlin-extensions"))
        api(project(":kotlin-react"))
        api(project(":kotlin-react-dom"))
        api(project(":kotlin-react-redux"))
        api(project(":kotlin-redux"))
        api(project(":kotlin-react-router-dom"))
        api(project(":kotlin-react-table"))
        api(project(":kotlin-ring-ui"))
        api(project(":kotlin-styled"))
    }
}
