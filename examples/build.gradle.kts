plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
}

dependencies {
    jsMainImplementation(project(":kotlin-emotion"))
    jsMainImplementation(project(":kotlin-js"))
    jsMainImplementation(project(":kotlin-react"))
    jsMainImplementation(project(":kotlin-react-dom"))
    jsMainImplementation(project(":kotlin-react-router-dom-legacy"))

    jsMainImplementation(kotlinxHtml("js"))

    jsMainImplementation(npm("react-quill", "1.3.5"))
    jsMainImplementation(npm("axios", "0.21.1"))
}
