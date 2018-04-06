package com.example.dbenitez.exampleservices.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by dbenitez on 3/27/2018.
 */

public class Schedules {

    private ArrayList<String> dates;
    private ArrayList<Cinema> cinemas;
    private ArrayList<Movie> movies;
    private ArrayList<Schedule> schedules;
    private ArrayList<Format> formats;
    private ArrayList<Route> routes;

    public ArrayList<String> getDates() {
        return dates;
    }

    public void setDates(ArrayList<String> dates) {
        this.dates = dates;
    }

    public ArrayList<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(ArrayList<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }

    public ArrayList<Format> getFormats() {
        return formats;
    }

    public void setFormats(ArrayList<Format> formats) {
        this.formats = formats;
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
    }

    public class Cinema{
        private String id;
        @SerializedName("vista_id")
        private String vistaId;
        @SerializedName("city_id")
        private String cityid;
        private String name;
        private String lat;
        private String Ing;
        private String phone;
        private String address;
        private String position;
        private Settings settings;


        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getVistaId() {
            return vistaId;
        }

        public void setVistaId(String vistaId) {
            this.vistaId = vistaId;
        }

        public String getCityid() {
            return cityid;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getIng() {
            return Ing;
        }

        public void setIng(String ing) {
            Ing = ing;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public Settings getSettings() {
            return settings;
        }

        public void setSettings(Settings settings) {
            this.settings = settings;
        }
    }


    public class Settings{
        @SerializedName("is_special_prices")
        private boolean isSpecialPrices;
        @SerializedName("type_food_sales")
        private String typeFoodSales;

        public boolean isSpecialPrices() {
            return isSpecialPrices;
        }

        public void setSpecialPrices(boolean specialPrices) {
            isSpecialPrices = specialPrices;
        }

        public String getTypeFoodSales() {
            return typeFoodSales;
        }

        public void setTypeFoodSales(String typeFoodSales) {
            this.typeFoodSales = typeFoodSales;
        }
    }



    public class Movie{
        private String id;
        private String name;
        private String code;
        private String rating;
        private String length;
        private String synopsis;
        private String genre;
        private ArrayList<Media> media;
        private int position;
        private String []categories={"presale","now_playing","coming_soon"};

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getLength() {
            return length;
        }

        public void setLength(String length) {
            this.length = length;
        }

        public String getSynopsis() {
            return synopsis;
        }

        public void setSynopsis(String synopsis) {
            this.synopsis = synopsis;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public ArrayList<Media> getMedia() {
            return media;
        }

        public void setMedia(ArrayList<Media> media) {
            this.media = media;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public String[] getCategories() {
            return categories;
        }

        public void setCategories(String[] categories) {
            this.categories = categories;
        }
    }

    public class Media{
        private String type;
        private String code;
        private String resource;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getResource() {
            return resource;
        }

        public void setResource(String resource) {
            this.resource = resource;
        }
    }

    public class Schedule{
        @SerializedName("movie_id")
        private int movieId;
        @SerializedName("cinema_id")
        private int cinemaId;
        @SerializedName("city_id")
        private int cityId;
        @SerializedName("is_special_prices")
        private boolean isSpecialPrices;
        private ArrayList<Date> dates;


        public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public int getCinemaId() {
            return cinemaId;
        }

        public void setCinemaId(int cinemaId) {
            this.cinemaId = cinemaId;
        }

        public int getCityId() {
            return cityId;
        }

        public void setCityId(int cityId) {
            this.cityId = cityId;
        }

        public boolean isSpecialPrices() {
            return isSpecialPrices;
        }

        public void setSpecialPrices(boolean specialPrices) {
            isSpecialPrices = specialPrices;
        }

        public ArrayList<Date> getDates() {
            return dates;
        }

        public void setDates(ArrayList<Date> dates) {
            this.dates = dates;
        }
    }

    public class Date{
        private String date;
        private ArrayList<Formats> formats;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public ArrayList<Formats> getFormats() {
            return formats;
        }

        public void setFormats(ArrayList<Formats> formats) {
            this.formats = formats;
        }
    }

    public class Formats{
        @SerializedName("format_id")
        private String formatId;
        @SerializedName("vista_id")
        private String vistaId;
        private String language;
        ArrayList<ShowTimes> showTimes;

        public String getFormatId() {
            return formatId;
        }

        public void setFormatId(String formatId) {
            this.formatId = formatId;
        }

        public String getVistaId() {
            return vistaId;
        }

        public void setVistaId(String vistaId) {
            this.vistaId = vistaId;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public ArrayList<ShowTimes> getShowTimes() {
            return showTimes;
        }

        public void setShowTimes(ArrayList<ShowTimes> showTimes) {
            this.showTimes = showTimes;
        }
    }
    public class ShowTimes{
        @SerializedName("vista_id")
        private String vistaId;
        private String datetime;
        private int screen;
        private Object settings;
        @SerializedName("early_morning")
        private boolean earlyMorning;

        public String getVistaId() {
            return vistaId;
        }

        public void setVistaId(String vistaId) {
            this.vistaId = vistaId;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public int getScreen() {
            return screen;
        }

        public void setScreen(int screen) {
            this.screen = screen;
        }

        public Object getSettings() {
            return settings;
        }

        public void setSettings(Object settings) {
            this.settings = settings;
        }

        public boolean isEarlyMorning() {
            return earlyMorning;
        }

        public void setEarlyMorning(boolean earlyMorning) {
            this.earlyMorning = earlyMorning;
        }
    }


    public class Format{
        private String id;
        private String name;
        @SerializedName("display_name")
        private String displayName;
        private String icon;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }


    public  class Route{
        private String code;
        private Sizes sizes;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public Sizes getSizes() {
            return sizes;
        }

        public void setSizes(Sizes sizes) {
            this.sizes = sizes;
        }
    }

    public  class Sizes{
        private String medium;
        private String large;
        private String small;
        @SerializedName("x-large")
        private String xLarge;

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getxLarge() {
            return xLarge;
        }

        public void setxLarge(String xLarge) {
            this.xLarge = xLarge;
        }
    }
}
