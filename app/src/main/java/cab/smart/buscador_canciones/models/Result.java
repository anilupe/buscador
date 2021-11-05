
package cab.smart.buscador_canciones.models;

import java.util.HashMap;
import java.util.Map;



public class Result {

    private String wrapperType;
    private String kind;
    private Integer artistId;
    private Integer collectionId;
    private Integer trackId;
    private String artistName;
    private String collectionName;
    private String trackName;
    private String collectionCensoredName;
    private String trackCensoredName;
    private String artistViewUrl;
    private String collectionViewUrl;
    private String trackViewUrl;
    private String previewUrl;
    private String artworkUrl30;
    private String artworkUrl60;
    private String artworkUrl100;
    private Double collectionPrice;
    private Double trackPrice;
    private Double collectionHdPrice;
    private Double trackHdPrice;
    private String releaseDate;
    private String collectionExplicitness;
    private String trackExplicitness;
    private Integer discCount;
    private Integer discNumber;
    private Integer trackCount;
    private Integer trackNumber;
    private Integer trackTimeMillis;
    private String country;
    private String currency;
    private String primaryGenreName;
    private String contentAdvisoryRating;
    private String shortDescription;
    private String longDescription;
    private Boolean isStreamable;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param artworkUrl100
     * @param trackTimeMillis
     * @param longDescription
     * @param country
     * @param previewUrl
     * @param collectionHdPrice
     * @param artistId
     * @param trackName
     * @param collectionName
     * @param artistViewUrl
     * @param discNumber
     * @param trackCount
     * @param artworkUrl30
     * @param wrapperType
     * @param currency
     * @param collectionId
     * @param isStreamable
     * @param trackExplicitness
     * @param collectionViewUrl
     * @param trackHdPrice
     * @param contentAdvisoryRating
     * @param trackNumber
     * @param releaseDate
     * @param kind
     * @param trackId
     * @param collectionPrice
     * @param shortDescription
     * @param discCount
     * @param primaryGenreName
     * @param trackPrice
     * @param collectionExplicitness
     * @param trackViewUrl
     * @param artworkUrl60
     * @param trackCensoredName
     * @param artistName
     * @param collectionCensoredName
     */
    public Result(String wrapperType, String kind, Integer artistId, Integer collectionId, Integer trackId, String artistName, String collectionName, String trackName, String collectionCensoredName, String trackCensoredName, String artistViewUrl, String collectionViewUrl, String trackViewUrl, String previewUrl, String artworkUrl30, String artworkUrl60, String artworkUrl100, Double collectionPrice, Double trackPrice, Double collectionHdPrice, Double trackHdPrice, String releaseDate, String collectionExplicitness, String trackExplicitness, Integer discCount, Integer discNumber, Integer trackCount, Integer trackNumber, Integer trackTimeMillis, String country, String currency, String primaryGenreName, String contentAdvisoryRating, String shortDescription, String longDescription, Boolean isStreamable) {
        super();
        this.wrapperType = wrapperType;
        this.kind = kind;
        this.artistId = artistId;
        this.collectionId = collectionId;
        this.trackId = trackId;
        this.artistName = artistName;
        this.collectionName = collectionName;
        this.trackName = trackName;
        this.collectionCensoredName = collectionCensoredName;
        this.trackCensoredName = trackCensoredName;
        this.artistViewUrl = artistViewUrl;
        this.collectionViewUrl = collectionViewUrl;
        this.trackViewUrl = trackViewUrl;
        this.previewUrl = previewUrl;
        this.artworkUrl30 = artworkUrl30;
        this.artworkUrl60 = artworkUrl60;
        this.artworkUrl100 = artworkUrl100;
        this.collectionPrice = collectionPrice;
        this.trackPrice = trackPrice;
        this.collectionHdPrice = collectionHdPrice;
        this.trackHdPrice = trackHdPrice;
        this.releaseDate = releaseDate;
        this.collectionExplicitness = collectionExplicitness;
        this.trackExplicitness = trackExplicitness;
        this.discCount = discCount;
        this.discNumber = discNumber;
        this.trackCount = trackCount;
        this.trackNumber = trackNumber;
        this.trackTimeMillis = trackTimeMillis;
        this.country = country;
        this.currency = currency;
        this.primaryGenreName = primaryGenreName;
        this.contentAdvisoryRating = contentAdvisoryRating;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.isStreamable = isStreamable;
    }

    public String getWrapperType() {
        return wrapperType;
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public Result withWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Result withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public Result withArtistId(Integer artistId) {
        this.artistId = artistId;
        return this;
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Result withCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public Result withTrackId(Integer trackId) {
        this.trackId = trackId;
        return this;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Result withArtistName(String artistName) {
        this.artistName = artistName;
        return this;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public Result withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Result withTrackName(String trackName) {
        this.trackName = trackName;
        return this;
    }

    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    public Result withCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
        return this;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    public Result withTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
        return this;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    public Result withArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
        return this;
    }

    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    public Result withCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
        return this;
    }

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    public Result withTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
        return this;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public Result withPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    public void setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
    }

    public Result withArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
        return this;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    public Result withArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
        return this;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public Result withArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
        return this;
    }

    public Double getCollectionPrice() {
        return collectionPrice;
    }

    public void setCollectionPrice(Double collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    public Result withCollectionPrice(Double collectionPrice) {
        this.collectionPrice = collectionPrice;
        return this;
    }

    public Double getTrackPrice() {
        return trackPrice;
    }

    public void setTrackPrice(Double trackPrice) {
        this.trackPrice = trackPrice;
    }

    public Result withTrackPrice(Double trackPrice) {
        this.trackPrice = trackPrice;
        return this;
    }

    public Double getCollectionHdPrice() {
        return collectionHdPrice;
    }

    public void setCollectionHdPrice(Double collectionHdPrice) {
        this.collectionHdPrice = collectionHdPrice;
    }

    public Result withCollectionHdPrice(Double collectionHdPrice) {
        this.collectionHdPrice = collectionHdPrice;
        return this;
    }

    public Double getTrackHdPrice() {
        return trackHdPrice;
    }

    public void setTrackHdPrice(Double trackHdPrice) {
        this.trackHdPrice = trackHdPrice;
    }

    public Result withTrackHdPrice(Double trackHdPrice) {
        this.trackHdPrice = trackHdPrice;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Result withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    public Result withCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
        return this;
    }

    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    public void setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
    }

    public Result withTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
        return this;
    }

    public Integer getDiscCount() {
        return discCount;
    }

    public void setDiscCount(Integer discCount) {
        this.discCount = discCount;
    }

    public Result withDiscCount(Integer discCount) {
        this.discCount = discCount;
        return this;
    }

    public Integer getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    public Result withDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
        return this;
    }

    public Integer getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(Integer trackCount) {
        this.trackCount = trackCount;
    }

    public Result withTrackCount(Integer trackCount) {
        this.trackCount = trackCount;
        return this;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Result withTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
        return this;
    }

    public Integer getTrackTimeMillis() {
        return trackTimeMillis;
    }

    public void setTrackTimeMillis(Integer trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
    }

    public Result withTrackTimeMillis(Integer trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Result withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Result withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    public Result withPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
        return this;
    }

    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    public Result withContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Result withShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Result withLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    public Boolean getIsStreamable() {
        return isStreamable;
    }

    public void setIsStreamable(Boolean isStreamable) {
        this.isStreamable = isStreamable;
    }

    public Result withIsStreamable(Boolean isStreamable) {
        this.isStreamable = isStreamable;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Result withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
