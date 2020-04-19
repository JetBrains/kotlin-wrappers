plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(project(":kotlin-react"))
    implementation(project(":kotlin-react-dom"))
    implementation(project(":kotlin-react-router-dom"))

    implementation(npm("react-quill", "1.3.5"))
    implementation(npm("axios", "0.19.2"))
}
