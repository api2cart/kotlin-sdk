/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.ProductAddBestOffer
import org.openapitools.client.models.ProductAddCertificationsInner
import org.openapitools.client.models.ProductAddFilesInner
import org.openapitools.client.models.ProductAddGroupPricesInner
import org.openapitools.client.models.ProductAddManufacturerInfo
import org.openapitools.client.models.ProductAddPackageDetails
import org.openapitools.client.models.ProductAddSalesTax
import org.openapitools.client.models.ProductAddSellerProfiles
import org.openapitools.client.models.ProductAddShippingDetailsInner
import org.openapitools.client.models.ProductAddSizeChart
import org.openapitools.client.models.ProductAddSpecificsInner
import org.openapitools.client.models.ProductAddTierPricesInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name Defines product's name that has to be added
 * @param model Defines product's model that has to be added
 * @param description Defines product's description that has to be added
 * @param price Defines product's price that has to be added
 * @param sku Defines product's sku that has to be added
 * @param oldPrice Defines product's old price
 * @param specialPrice Defines product's model that has to be added
 * @param costPrice Defines new product's cost price
 * @param fixedCostShippingPrice Specifies product's fixed cost shipping price
 * @param spriceCreate Defines the date of special price creation
 * @param spriceModified Defines the date of special price modification
 * @param spriceExpire Defines the term of special price offer duration
 * @param tierPrices Defines product's tier prices
 * @param groupPrices Defines product's group prices
 * @param availableForView Specifies the set of visible/invisible products for users
 * @param availableForSale Specifies the set of visible/invisible products for sale
 * @param weight Weight
 * @param width Defines product's width
 * @param height Defines product's height
 * @param length Defines product's length
 * @param weightUnit Weight Unit
 * @param dimensionsUnit Weight Unit
 * @param shortDescription Defines short description
 * @param warehouseId This parameter is used for selecting a warehouse where you need to set/modify a product quantity.
 * @param backorderStatus Set backorder status
 * @param quantity Defines product's quantity that has to be added
 * @param downloadable Defines whether the product is downloadable
 * @param wholesalePrice Defines product's sale price
 * @param createdAt Defines the date of entity creation
 * @param manufacturer Defines product's manufacturer
 * @param manufacturerId Defines product's manufacturer by manufacturer_id
 * @param categoriesIds Defines product add that is specified by comma-separated categories id
 * @param relatedProductsIds Defines product's related products ids that has to be added
 * @param upSellProductsIds Defines product's up-sell products ids that has to be added
 * @param crossSellProductsIds Defines product's cross-sell products ids that has to be added
 * @param taxClassId Defines tax classes where entity has to be added
 * @param type Defines product's type
 * @param metaTitle Defines unique meta title for each entity
 * @param metaKeywords Defines unique meta keywords for each entity
 * @param metaDescription Defines unique meta description of a entity
 * @param url Defines unique product's URL
 * @param langId Language id
 * @param storesIds Assign product to the stores that is specified by comma-separated stores' id
 * @param categoryId Defines product add that is specified by category id
 * @param viewedCount Specifies the number of product's reviews
 * @param orderedCount Defines how many times the product was ordered
 * @param attributeSetName Defines product’s attribute set name in Magento
 * @param attributeName Defines product’s attribute name separated with a comma in Magento
 * @param shippingTemplateId The numeric ID of the shipping template associated with the products in Etsy. You can find possible values in the \"cart.info\" API method response, in the field shipping_zones[]->id.
 * @param productionPartnerIds Defines product's production partner ids that has to be added
 * @param condition The human-readable label for the condition (e.g., \"New\").
 * @param listingDuration Describes the number of days the seller wants the listing to be active. Look at cart.info method response for allowed values.
 * @param listingType Indicates the selling format of the marketplace listing.
 * @param paymentMethods Identifies the payment method (such as PayPal) that the seller will accept when the buyer pays for the item. Look at cart.info method response for allowed values.<hr><div style=\"font-style:normal\">Param structure:<div style=\"margin-left: 2%;\"><code style=\"padding:0; background-color:#ffffff;font-size:85%;font-family:monospace;\">payment_methods[0] = string</br>payment_methods[1] = string</br></code></div></div>
 * @param returnAccepted Indicates whether the seller allows the buyer to return the item.
 * @param shippingDetails The shipping details, including flat and calculated shipping costs and shipping insurance costs. Look at cart.info method response for allowed values.<hr><div style=\"font-style:normal\">Param structure:<div style=\"margin-left: 2%;\"><code style=\"padding:0; background-color:#ffffff;font-size:85%;font-family:monospace;\">shipping_details[0][<b>shipping_type</b>] = string </br>shipping_details[0][<b>shipping_service</b>] = string</br>shipping_details[0][<b>shipping_cost</b>] = decimal</br>shipping_details[1][<b>shipping_type</b>] = string </br>shipping_details[1][<b>shipping_service</b>] = string</br>shipping_details[1][<b>shipping_cost</b>] = decimal</br></code></div></div>
 * @param paypalEmail Valid PayPal email address for the PayPal account that the seller will use if they offer PayPal as a payment method for the listing.
 * @param sellerProfiles 
 * @param packageDetails 
 * @param bestOffer 
 * @param salesTax 
 * @param barcode A barcode is a unique code composed of numbers used as a product identifier.
 * @param upc Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products.
 * @param ean European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products.
 * @param isbn International Standard Book Number. An ISBN is a unique identifier for books.
 * @param specifics An array of Item Specific Name/Value pairs used by the seller to provide descriptive details of an item in a structured manner.         The list of possible specifications can be obtained using the category.info method (additional_fields->product_specifics).         <b>The structure of the parameter is different for specific platforms.</b>
 * @param imageUrl Image Url
 * @param imageName Defines image's name
 * @param reservePrice Defines reserve price value
 * @param buyitnowPrice Defines buy it now value
 * @param conditionDescription Detailed description of the product condition.
 * @param auctionConfidentialityLevel This allows buyers to remain anonymous when the bid or buy an item.
 * @param availFrom Allows to schedule a time in the future that the item becomes available. The value should be greater than the current date and time.
 * @param tags Product tags
 * @param clearCache Is cache clear required
 * @param asin Amazon Standard Identification Number.
 * @param gtin Global Trade Item Number. An GTIN is an identifier for trade items.
 * @param mpn Manufacturer Part Number. A MPN is an identifier of a particular part design or material used.
 * @param taxable Specifies whether a tax is charged
 * @param visible Set visibility status
 * @param status Defines product's status
 * @param seoUrl Defines unique URL for SEO
 * @param productClass A categorization for the product
 * @param productType A categorization for the product
 * @param marketplaceItemProperties String containing the JSON representation of the supplied data
 * @param manageStock Defines inventory tracking for product
 * @param harmonizedSystemCode Harmonized System Code. An HSC is a 6-digit identifier that allows participating countries to classify traded goods on a common basis for customs purposes
 * @param countryOfOrigin The country where the inventory item was made
 * @param files File Url
 * @param searchKeywords Defines unique search keywords
 * @param storeId Store Id
 * @param brandName Defines product brand name
 * @param isVirtual Defines whether the product is virtual
 * @param isFreeShipping Specifies product's free shipping flag that has to be added
 * @param inStock Set stock status
 * @param deliveryCode The delivery promise that applies to offer
 * @param productReference Groups all variations, that you want to combine into one product.
 * @param deliveryType Defines the type of the delivery.
 * @param deliveryTime Defines delivery time in days.
 * @param sizeChart 
 * @param certifications An array of product certifications. The list of possible certifications can be obtained using the \"<i>category.info</i>\" method (<i>additional_fields->rules->product_certifications</i>).
 * @param deliveryOptionIds Defines delivery options for product by ids.
 * @param manufacturerInfo 
 * @param whenMade An enumerated string for the era in which the maker made the product.
 * @param isSupply If true, it indicates the product as a supply, otherwise it indicates that it is a finished product.
 * @param materials A list of material strings for materials used in the product.
 * @param autoRenew When true, automatically renews a listing upon its expiration.
 * @param allowDisplayCondition Flag used to determine whether the product condition is shown to the customer on the product page.
 * @param minOrderQuantity The minimum quantity an order must contain, to be eligible to purchase this product.
 * @param maxOrderQuantity The maximum quantity an order can contain when purchasing the product.
 */


data class ProductAdd (

    /* Defines product's name that has to be added */
    @Json(name = "name")
    val name: kotlin.String,

    /* Defines product's model that has to be added */
    @Json(name = "model")
    val model: kotlin.String,

    /* Defines product's description that has to be added */
    @Json(name = "description")
    val description: kotlin.String,

    /* Defines product's price that has to be added */
    @Json(name = "price")
    val price: java.math.BigDecimal,

    /* Defines product's sku that has to be added */
    @Json(name = "sku")
    val sku: kotlin.String? = null,

    /* Defines product's old price */
    @Json(name = "old_price")
    val oldPrice: java.math.BigDecimal? = null,

    /* Defines product's model that has to be added */
    @Json(name = "special_price")
    val specialPrice: java.math.BigDecimal? = null,

    /* Defines new product's cost price */
    @Json(name = "cost_price")
    val costPrice: java.math.BigDecimal? = null,

    /* Specifies product's fixed cost shipping price */
    @Json(name = "fixed_cost_shipping_price")
    val fixedCostShippingPrice: java.math.BigDecimal? = null,

    /* Defines the date of special price creation */
    @Json(name = "sprice_create")
    val spriceCreate: kotlin.String? = null,

    /* Defines the date of special price modification */
    @Json(name = "sprice_modified")
    val spriceModified: kotlin.String? = null,

    /* Defines the term of special price offer duration */
    @Json(name = "sprice_expire")
    val spriceExpire: kotlin.String? = null,

    /* Defines product's tier prices */
    @Json(name = "tier_prices")
    val tierPrices: kotlin.collections.List<ProductAddTierPricesInner>? = null,

    /* Defines product's group prices */
    @Json(name = "group_prices")
    val groupPrices: kotlin.collections.List<ProductAddGroupPricesInner>? = null,

    /* Specifies the set of visible/invisible products for users */
    @Json(name = "available_for_view")
    val availableForView: kotlin.Boolean? = true,

    /* Specifies the set of visible/invisible products for sale */
    @Json(name = "available_for_sale")
    val availableForSale: kotlin.Boolean? = true,

    /* Weight */
    @Json(name = "weight")
    val weight: java.math.BigDecimal? = java.math.BigDecimal("0"),

    /* Defines product's width */
    @Json(name = "width")
    val width: java.math.BigDecimal? = null,

    /* Defines product's height */
    @Json(name = "height")
    val height: java.math.BigDecimal? = null,

    /* Defines product's length */
    @Json(name = "length")
    val length: java.math.BigDecimal? = null,

    /* Weight Unit */
    @Json(name = "weight_unit")
    val weightUnit: kotlin.String? = null,

    /* Weight Unit */
    @Json(name = "dimensions_unit")
    val dimensionsUnit: kotlin.String? = null,

    /* Defines short description */
    @Json(name = "short_description")
    val shortDescription: kotlin.String? = null,

    /* This parameter is used for selecting a warehouse where you need to set/modify a product quantity. */
    @Json(name = "warehouse_id")
    val warehouseId: kotlin.String? = null,

    /* Set backorder status */
    @Json(name = "backorder_status")
    val backorderStatus: kotlin.String? = null,

    /* Defines product's quantity that has to be added */
    @Json(name = "quantity")
    val quantity: java.math.BigDecimal? = java.math.BigDecimal("0"),

    /* Defines whether the product is downloadable */
    @Json(name = "downloadable")
    val downloadable: kotlin.Boolean? = false,

    /* Defines product's sale price */
    @Json(name = "wholesale_price")
    val wholesalePrice: java.math.BigDecimal? = null,

    /* Defines the date of entity creation */
    @Json(name = "created_at")
    val createdAt: kotlin.String? = null,

    /* Defines product's manufacturer */
    @Json(name = "manufacturer")
    val manufacturer: kotlin.String? = null,

    /* Defines product's manufacturer by manufacturer_id */
    @Json(name = "manufacturer_id")
    val manufacturerId: kotlin.String? = null,

    /* Defines product add that is specified by comma-separated categories id */
    @Json(name = "categories_ids")
    val categoriesIds: kotlin.String? = null,

    /* Defines product's related products ids that has to be added */
    @Json(name = "related_products_ids")
    val relatedProductsIds: kotlin.String? = null,

    /* Defines product's up-sell products ids that has to be added */
    @Json(name = "up_sell_products_ids")
    val upSellProductsIds: kotlin.String? = null,

    /* Defines product's cross-sell products ids that has to be added */
    @Json(name = "cross_sell_products_ids")
    val crossSellProductsIds: kotlin.String? = null,

    /* Defines tax classes where entity has to be added */
    @Json(name = "tax_class_id")
    val taxClassId: kotlin.String? = null,

    /* Defines product's type */
    @Json(name = "type")
    val type: kotlin.String? = "simple",

    /* Defines unique meta title for each entity */
    @Json(name = "meta_title")
    val metaTitle: kotlin.String? = null,

    /* Defines unique meta keywords for each entity */
    @Json(name = "meta_keywords")
    val metaKeywords: kotlin.String? = null,

    /* Defines unique meta description of a entity */
    @Json(name = "meta_description")
    val metaDescription: kotlin.String? = null,

    /* Defines unique product's URL */
    @Json(name = "url")
    val url: kotlin.String? = null,

    /* Language id */
    @Json(name = "lang_id")
    val langId: kotlin.String? = null,

    /* Assign product to the stores that is specified by comma-separated stores' id */
    @Json(name = "stores_ids")
    val storesIds: kotlin.String? = null,

    /* Defines product add that is specified by category id */
    @Json(name = "category_id")
    val categoryId: kotlin.String? = null,

    /* Specifies the number of product's reviews */
    @Json(name = "viewed_count")
    val viewedCount: kotlin.Int? = 0,

    /* Defines how many times the product was ordered */
    @Json(name = "ordered_count")
    val orderedCount: kotlin.Int? = 0,

    /* Defines product’s attribute set name in Magento */
    @Json(name = "attribute_set_name")
    val attributeSetName: kotlin.String? = "Default",

    /* Defines product’s attribute name separated with a comma in Magento */
    @Json(name = "attribute_name")
    val attributeName: kotlin.String? = null,

    /* The numeric ID of the shipping template associated with the products in Etsy. You can find possible values in the \"cart.info\" API method response, in the field shipping_zones[]->id. */
    @Json(name = "shipping_template_id")
    val shippingTemplateId: kotlin.Int? = 0,

    /* Defines product's production partner ids that has to be added */
    @Json(name = "production_partner_ids")
    val productionPartnerIds: kotlin.String? = null,

    /* The human-readable label for the condition (e.g., \"New\"). */
    @Json(name = "condition")
    val condition: kotlin.String? = null,

    /* Describes the number of days the seller wants the listing to be active. Look at cart.info method response for allowed values. */
    @Json(name = "listing_duration")
    val listingDuration: kotlin.String? = null,

    /* Indicates the selling format of the marketplace listing. */
    @Json(name = "listing_type")
    val listingType: kotlin.String? = "FixedPrice",

    /* Identifies the payment method (such as PayPal) that the seller will accept when the buyer pays for the item. Look at cart.info method response for allowed values.<hr><div style=\"font-style:normal\">Param structure:<div style=\"margin-left: 2%;\"><code style=\"padding:0; background-color:#ffffff;font-size:85%;font-family:monospace;\">payment_methods[0] = string</br>payment_methods[1] = string</br></code></div></div> */
    @Json(name = "payment_methods")
    val paymentMethods: kotlin.collections.List<kotlin.String>? = null,

    /* Indicates whether the seller allows the buyer to return the item. */
    @Json(name = "return_accepted")
    val returnAccepted: kotlin.Boolean? = null,

    /* The shipping details, including flat and calculated shipping costs and shipping insurance costs. Look at cart.info method response for allowed values.<hr><div style=\"font-style:normal\">Param structure:<div style=\"margin-left: 2%;\"><code style=\"padding:0; background-color:#ffffff;font-size:85%;font-family:monospace;\">shipping_details[0][<b>shipping_type</b>] = string </br>shipping_details[0][<b>shipping_service</b>] = string</br>shipping_details[0][<b>shipping_cost</b>] = decimal</br>shipping_details[1][<b>shipping_type</b>] = string </br>shipping_details[1][<b>shipping_service</b>] = string</br>shipping_details[1][<b>shipping_cost</b>] = decimal</br></code></div></div> */
    @Json(name = "shipping_details")
    val shippingDetails: kotlin.collections.List<ProductAddShippingDetailsInner>? = null,

    /* Valid PayPal email address for the PayPal account that the seller will use if they offer PayPal as a payment method for the listing. */
    @Json(name = "paypal_email")
    val paypalEmail: kotlin.String? = null,

    @Json(name = "seller_profiles")
    val sellerProfiles: ProductAddSellerProfiles? = null,

    @Json(name = "package_details")
    val packageDetails: ProductAddPackageDetails? = null,

    @Json(name = "best_offer")
    val bestOffer: ProductAddBestOffer? = null,

    @Json(name = "sales_tax")
    val salesTax: ProductAddSalesTax? = null,

    /* A barcode is a unique code composed of numbers used as a product identifier. */
    @Json(name = "barcode")
    val barcode: kotlin.String? = null,

    /* Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products. */
    @Json(name = "upc")
    val upc: kotlin.String? = null,

    /* European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products. */
    @Json(name = "ean")
    val ean: kotlin.String? = null,

    /* International Standard Book Number. An ISBN is a unique identifier for books. */
    @Json(name = "isbn")
    val isbn: kotlin.String? = null,

    /* An array of Item Specific Name/Value pairs used by the seller to provide descriptive details of an item in a structured manner.         The list of possible specifications can be obtained using the category.info method (additional_fields->product_specifics).         <b>The structure of the parameter is different for specific platforms.</b> */
    @Json(name = "specifics")
    val specifics: kotlin.collections.List<ProductAddSpecificsInner>? = null,

    /* Image Url */
    @Json(name = "image_url")
    val imageUrl: kotlin.String? = null,

    /* Defines image's name */
    @Json(name = "image_name")
    val imageName: kotlin.String? = null,

    /* Defines reserve price value */
    @Json(name = "reserve_price")
    val reservePrice: java.math.BigDecimal? = null,

    /* Defines buy it now value */
    @Json(name = "buyitnow_price")
    val buyitnowPrice: java.math.BigDecimal? = null,

    /* Detailed description of the product condition. */
    @Json(name = "condition_description")
    val conditionDescription: kotlin.String? = null,

    /* This allows buyers to remain anonymous when the bid or buy an item. */
    @Json(name = "auction_confidentiality_level")
    val auctionConfidentialityLevel: kotlin.String? = null,

    /* Allows to schedule a time in the future that the item becomes available. The value should be greater than the current date and time. */
    @Json(name = "avail_from")
    val availFrom: kotlin.String? = null,

    /* Product tags */
    @Json(name = "tags")
    val tags: kotlin.String? = null,

    /* Is cache clear required */
    @Json(name = "clear_cache")
    val clearCache: kotlin.Boolean? = true,

    /* Amazon Standard Identification Number. */
    @Json(name = "asin")
    val asin: kotlin.String? = null,

    /* Global Trade Item Number. An GTIN is an identifier for trade items. */
    @Json(name = "gtin")
    val gtin: kotlin.String? = null,

    /* Manufacturer Part Number. A MPN is an identifier of a particular part design or material used. */
    @Json(name = "mpn")
    val mpn: kotlin.String? = null,

    /* Specifies whether a tax is charged */
    @Json(name = "taxable")
    val taxable: kotlin.Boolean? = true,

    /* Set visibility status */
    @Json(name = "visible")
    val visible: kotlin.String? = null,

    /* Defines product's status */
    @Json(name = "status")
    val status: kotlin.String? = null,

    /* Defines unique URL for SEO */
    @Json(name = "seo_url")
    val seoUrl: kotlin.String? = null,

    /* A categorization for the product */
    @Json(name = "product_class")
    val productClass: kotlin.String? = null,

    /* A categorization for the product */
    @Json(name = "product_type")
    val productType: kotlin.String? = null,

    /* String containing the JSON representation of the supplied data */
    @Json(name = "marketplace_item_properties")
    val marketplaceItemProperties: kotlin.String? = null,

    /* Defines inventory tracking for product */
    @Json(name = "manage_stock")
    val manageStock: kotlin.Boolean? = null,

    /* Harmonized System Code. An HSC is a 6-digit identifier that allows participating countries to classify traded goods on a common basis for customs purposes */
    @Json(name = "harmonized_system_code")
    val harmonizedSystemCode: kotlin.String? = null,

    /* The country where the inventory item was made */
    @Json(name = "country_of_origin")
    val countryOfOrigin: kotlin.String? = null,

    /* File Url */
    @Json(name = "files")
    val files: kotlin.collections.List<ProductAddFilesInner>? = null,

    /* Defines unique search keywords */
    @Json(name = "search_keywords")
    val searchKeywords: kotlin.String? = null,

    /* Store Id */
    @Json(name = "store_id")
    val storeId: kotlin.String? = null,

    /* Defines product brand name */
    @Json(name = "brand_name")
    val brandName: kotlin.String? = null,

    /* Defines whether the product is virtual */
    @Json(name = "is_virtual")
    val isVirtual: kotlin.Boolean? = false,

    /* Specifies product's free shipping flag that has to be added */
    @Json(name = "is_free_shipping")
    val isFreeShipping: kotlin.Boolean? = null,

    /* Set stock status */
    @Json(name = "in_stock")
    val inStock: kotlin.Boolean? = null,

    /* The delivery promise that applies to offer */
    @Json(name = "delivery_code")
    val deliveryCode: kotlin.String? = null,

    /* Groups all variations, that you want to combine into one product. */
    @Json(name = "product_reference")
    val productReference: kotlin.String? = null,

    /* Defines the type of the delivery. */
    @Json(name = "delivery_type")
    val deliveryType: kotlin.String? = null,

    /* Defines delivery time in days. */
    @Json(name = "delivery_time")
    val deliveryTime: kotlin.Int? = null,

    @Json(name = "size_chart")
    val sizeChart: ProductAddSizeChart? = null,

    /* An array of product certifications. The list of possible certifications can be obtained using the \"<i>category.info</i>\" method (<i>additional_fields->rules->product_certifications</i>). */
    @Json(name = "certifications")
    val certifications: kotlin.collections.List<ProductAddCertificationsInner>? = null,

    /* Defines delivery options for product by ids. */
    @Json(name = "delivery_option_ids")
    val deliveryOptionIds: kotlin.String? = null,

    @Json(name = "manufacturer_info")
    val manufacturerInfo: ProductAddManufacturerInfo? = null,

    /* An enumerated string for the era in which the maker made the product. */
    @Json(name = "when_made")
    val whenMade: kotlin.String? = "made_to_order",

    /* If true, it indicates the product as a supply, otherwise it indicates that it is a finished product. */
    @Json(name = "is_supply")
    val isSupply: kotlin.Boolean? = true,

    /* A list of material strings for materials used in the product. */
    @Json(name = "materials")
    val materials: kotlin.collections.List<kotlin.String>? = null,

    /* When true, automatically renews a listing upon its expiration. */
    @Json(name = "auto_renew")
    val autoRenew: kotlin.Boolean? = false,

    /* Flag used to determine whether the product condition is shown to the customer on the product page. */
    @Json(name = "allow_display_condition")
    val allowDisplayCondition: kotlin.Boolean? = null,

    /* The minimum quantity an order must contain, to be eligible to purchase this product. */
    @Json(name = "min_order_quantity")
    val minOrderQuantity: java.math.BigDecimal? = null,

    /* The maximum quantity an order can contain when purchasing the product. */
    @Json(name = "max_order_quantity")
    val maxOrderQuantity: java.math.BigDecimal? = null

) {


}

