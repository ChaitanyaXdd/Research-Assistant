# Smart Research Assistant Extension

This Smart Research Assistant extension is designed to aid researchers by summarizing selected text from articles or documents efficiently. The extension opens a side panel and provides a concise summary of the selected text. Additionally, it saves notes locally for future reference, making the research process more streamlined and effective.

## Features

- **Summarize Text**: Select text and click the summarize button to get a concise summary.
- **Save Notes Locally**: Save your notes locally for easy access and reference.
- **Side Panel**: Opens a side panel for a seamless user experience.

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/ChaitanyaXdd/Research-Assistant.git
    ```
2. Navigate to the project directory:
    ```bash
    cd Research-Assistant
    ```
3. Install the required dependencies for the backend:
    ```bash
    cd backend
    mvn install
    ```
4. Start the backend server:
    ```bash
    mvn spring-boot:run
    ```
5. Load the extension in your browser:
    - Open your browser and go to the extensions page.
    - Enable "Developer mode".
    - Click "Load unpacked" and select the `extension` folder from the project directory.

## Usage

1. Select the text you want to summarize.
2. Click the summarize button in the side panel.
3. View the concise summary in the side panel.
4. Save your notes for future reference.

## Technologies Used

- **Backend**: Spring Boot
- **Frontend**: HTML, CSS, JavaScript
- **Extension Manifest**: JSON
