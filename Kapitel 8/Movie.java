/* Movie
-  id
-  title
-  genre
-  year
-  director
-  duration
-  rating
// costructors
+  Movie(int id, String title)
+  Movie(int id, String title, String genre, int year, String director, int duration, double rating)
// Create Getters & Setters for all fields
+  getId()
+  setId()
….. etc */

public class Movie
{
   private int id;
   private String title;
   private String genre;
   private int year;
   private String director;
   private int duration;
   private double rating;
   
   public Movie(int id, String title)
   {
      this.id = id;
      this.title = title;
   }
   
   public Movie(int id, String title, String genre, int year, String director, int duration, double rating)
   {
      setId();
      setTitle();
      setGenre();
      setYear();
      setDirector();
      setDuration();
      setRating();
   }
   
   public int getId()
   {
      return id;
   }
   
   public void setId(int id)
   {
      this.id = id;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public void setTitle(String title)
   {
      this.title = title;
   }
   
   public String getGenre()
   {
      return genre;
   }
   
   public void setGenre(String genre)
   {
      this.genre = genre;
   }
   
   public int getYear()
   {
      return year;
   }
   
   public void setYear(int year)
   {
      this.year = year;
   }
   
   public String getDirector()
   {
      return director;
   }
   
   public void setDirector(String director)
   {
      this.director = director;
   }
   
   public int getDuration()
   {
      return duration;
   }
   
   public void setDuration(int duration)
   {
      this.duration = duration;
   }
   
   public double getRating()
   {
      return rating;
   }
   
   public void setRating(int rating)
   {
      this.rating = rating;
   }
}