# QuestMVVM_0253

A simple Android Jetpack Compose application built with MVVM architecture, demonstrating a registration form (Formulir) and a detail view.

## Features
- **Jetpack Compose**: Built entirely using Compose for the UI.
- **MVVM Architecture**: Clean separation between UI and business logic using `ViewModel` and `StateFlow`.
- **Navigation Component**: In-app routing via `NavHost` for seamless transitions between the Form and Detail screens.
- **Dynamic Form**: Validation enabling the submit button only when fields are filled.

## Screens
- **Formulir Screen**: Allows users to input their name, gender (via radio buttons), and address.
- **Detail Screen**: Displays the submitted data in a clean layout and provides a back navigation button.

## Tools & Libraries Used
- Kotlin
- Jetpack Compose (Material 3)
- Navigation Compose
- Lifecycle ViewModel Compose
- Coroutines & StateFlow
