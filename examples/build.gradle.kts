plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(project(":kotlin-react"))
    implementation(project(":kotlin-react-dom"))
    implementation(project(":kotlin-react-router-dom"))
}
