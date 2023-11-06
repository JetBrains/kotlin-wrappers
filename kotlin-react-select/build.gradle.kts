plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    seskar()
}

dependencies {
    jsMainApi(project(":kotlin-emotion"))
    jsMainApi(project(":kotlin-react"))
    jsMainApi(project(":kotlin-react-dom"))

    jsMainImplementation(seskarCore())

    jsMainApi(npmv("react-select"))
}
