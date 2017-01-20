# android-textbook-resale-app-
Android application for posting and purchasing used textbooks

Server scripts availible in this repo: https://github.com/roeje/barter-books-server-scripts.git

###Objective & Scope: 
Barter books is a Android application that connects people who are interested in buying, selling, or trading used textbooks (or any book in general). The app will allow users to post relevant information regarding books they wish to sell to the app database, and query the database for relevant textbooks based on ISBN numbers. The app will allow the user to create an account in the app and save relevant data to their account (favorites, currently posted books, etc). The application will integrate data retrieved through communication with the Google Books API. This information can include: title, publication details, cover art, and more. For a given book posed to the database, the email address of the user who posted the book will be saved in the database. On querying a specific book located in the database, a user will be able to, on the click of a button, email the book's owner. Our app now connects to a MySQL database hosted on the University’s server. Through the use of PHP scripts made by HTTP requests inside the app we can return data from our database. A major feature that we added is a barcode scanner, which scans any barcode from a book or textbook and pulls down the book information and thumbnail from Google.


###Revision One Features:
 * App template and parse integration with activities.
 * Main activity with login view and default popup messages
 * Mock login and signup page
 * Basic input parsing and error checking for login/signup input fields
 * Custom adapter classes to pull data from parse and build listview
 * Auto-populated book list activity using custom adapters
 * Basic unit testing of some activity methods
 * Basic application testing of login buttons and activity switching

###Revision Two Features:
 * Integrate Google Books Api into app to allow the querying of a specific book based on ISBN number.
 * Parsing of Google Books Api return JSON into usable data.
 * Significantly expanding the user interface of the application.
 * A user account page not contains buttons to allow the user to accomplish specific tasks within the app.
 * Activities to allow the user to search for a specific book by ISBN (both within the database, and online through an api query)
 * Activities to display results for both database and api queries.
 * Overhaul of the layout of many current Activities to increase usability.
 * Creation of custom Parse and Api call controllers to handle data requests
 * Overhaul of controllers to improve OO design.
 * Creation of Book class to hold relevant data for a specific book instance.
 * Basic Navigation Drawer added to all main Activities.
 * Extended System Testing of UI components and flow

###Revision Three Features:
 * Barcode scanner:
 * Implement an isbn barcode scanner based on the Zxing Android library project.
 * Navigation drawer polished:
 * Icons added, uniform design implemented for entire app.
 * Login and signup functionality implemented:
 * Local data store added to allow users to login.
 * Login data persists across all activities.
 * Username used to identify all database interaction.
 * Added MySQL connectivity:
 * Php backend script created to manage integration with MySql database.
 * Java controllers created to manage database http requests.
 * Async Tasks added to allow http requests to take place on separate threads.
 * Extended System and Unit testing added.
