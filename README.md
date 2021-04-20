# Songr
Allows user to add albums and song tracks to the albums.

## Controler.java
* /hello - route will return an html that says Hello World!
* /capitalize/{request param} - route will return an html capitalizing all words in the request param.
* /albums - route will show all of the albums from the database as well as a form.
* /addAlbums - route will post new album information to the database.

## SongController.java
* /allsongs - route will get all songs and direct to AllSongs.html.
* /addSong - route will add a song to the database with it album.
* /addsong{id} - route will pass album to song page to save it to database.
* /song/{id} - route will Show the songs that belong to an album.

## To use
* ./gradlew run
* open Test file to see tests
