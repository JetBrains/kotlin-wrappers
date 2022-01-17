plugins {
    `java-platform`
    `publish-conventions`
}

dependencies {
    constraints {
        api(project(":kotlin-css"))
        api(project(":kotlin-csstype"))
        api(project(":kotlin-emotion"))
        api(project(":kotlin-extensions"))
        api(project(":kotlin-history"))
        api(project(":kotlin-mui"))
        api(project(":kotlin-mui-icons"))
        api(project(":kotlin-popper"))
        api(project(":kotlin-react"))
        api(project(":kotlin-react-core"))
        api(project(":kotlin-react-css"))
        api(project(":kotlin-react-dom"))
        api(project(":kotlin-react-dom-legacy"))
        api(project(":kotlin-react-legacy"))
        api(project(":kotlin-react-popper"))
        api(project(":kotlin-react-query"))
        api(project(":kotlin-react-redux"))
        api(project(":kotlin-react-router-dom"))
        api(project(":kotlin-react-table"))
        api(project(":kotlin-react-virtual"))
        api(project(":kotlin-redux"))
        api(project(":kotlin-ring-ui"))
        api(project(":kotlin-styled"))
        api(project(":kotlin-styled-next"))
        api(project(":kotlin-typescript"))
    }
}
