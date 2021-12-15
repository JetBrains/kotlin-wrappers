plugins {
    kotlin("js")
    `kotlin-conventions`
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(project(":kotlin-react-dom-legacy"))
    implementation(project(":kotlin-react-router-dom-legacy"))

    implementation(kotlinxHtml("js"))

    implementation(npm("react-quill", "1.3.5"))
    implementation(npm("axios", "0.21.1"))
}
