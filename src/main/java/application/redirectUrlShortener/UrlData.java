package application.redirectUrlShortener;

public record UrlData(String originalUrl, long expirationTime) {
}
