plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(project(":kotlin-react"))
    implementation(project(":kotlin-react-dom"))
    implementation(project(":kotlin-react-router-dom"))

    implementation(kotlinxHtml("js"))

    implementation(npm("react-quill", "1.3.5"))
    implementation(npm("axios", "0.21.1"))
}
