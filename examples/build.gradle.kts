plugins {
    kotlin("js")
    `kotlin-conventions`
}

dependencies {
    implementation(project(":kotlin-emotion"))
    implementation(project(":kotlin-js"))
    implementation(project(":kotlin-react"))
    implementation(project(":kotlin-react-dom"))
    implementation(project(":kotlin-react-router-dom"))

    implementation(kotlinxHtml("js"))

    implementation(npm("react-quill", "1.3.5"))
    implementation(npm("axios", "0.21.1"))
}
