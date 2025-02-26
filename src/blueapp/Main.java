package blueapp;

import java.awt.EventQueue;

import gr.aueb.cf.schoolapp.LandingPage;

public class Main {
	
	private final static LandingPage landingPage = new LandingPage();
	private final static SaleRetailPage saleRetailPage = new SaleRetailPage();
	private final static CustomersPage customersPage = new CustomersPage();
	private final static AddCustomerPage addCustomerPage = new AddCustomerPage();
	private final static StatisticsPage statisticsPage = new StatisticsPage();
	private final static UpdateCustomerPage updateCustomerPage = new UpdateCustomerPage();
	private final static CustomerStatsPage customerStatsPage = new CustomerStatsPage();
	private final static CustomerViewPage customerViewPage = new CustomerViewPage();
	private final static StockPage stockPage = new StockPage();
	private final static AddProductPage addProductPage = new AddProductPage();
	private final static ProductsPage productsPage = new ProductsPage();
	private final static ProductStatsPage productStatsPage = new ProductStatsPage();
	private final static ProductViewPage productViewPage = new ProductViewPage();
	private final static UpdateProductPage updateProductPage = new UpdateProductPage();
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					landingPage.setVisible(true);
					landingPage.setLocationRelativeTo(null);
					
					saleRetailPage.setVisible(false);
					saleRetailPage.setLocationRelativeTo(null);
					
					customersPage.setVisible(false);
					customersPage.setLocationRelativeTo(null);
					
					addCustomerPage.setVisible(false);
					addCustomerPage.setLocationRelativeTo(null);
					
					statisticsPage.setVisible(false);
					statisticsPage.setLocationRelativeTo(null);
					
					updateCustomerPage.setVisible(false);
					updateCustomerPage.setLocationRelativeTo(null);
					
					stockPage.setVisible(false);
					stockPage.setLocationRelativeTo(null);
					
					customerViewPage.setVisible(false);
					customerViewPage.setLocationRelativeTo(null);
					
					customerStatsPage.setVisible(false);
					customerStatsPage.setLocationRelativeTo(null);
					
					addProductPage.setVisible(false);
					addProductPage.setLocationRelativeTo(null);
					
					productsPage.setVisible(false);
					productsPage.setLocationRelativeTo(null);
					
					productStatsPage.setVisible(false);
					productStatsPage.setLocationRelativeTo(null);
					
					productViewPage.setVisible(false);
					productViewPage.setLocationRelativeTo(null);
					
					updateProductPage.setVisible(false);
					updateProductPage.setLocationRelativeTo(null);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static LandingPage getLandingPage() {
		return landingPage;
	}

	public static SaleRetailPage getSaleRetailPage() {
		return saleRetailPage;
	}

	public static CustomersPage getCustomersPage() {
		return customersPage;
	}

	public static AddCustomerPage getAddCustomerPage() {
		return addCustomerPage;
	}

	public static StatisticsPage getStatisticsPage() {
		return statisticsPage;
	}

	public static UpdateCustomerPage getUpdateCustomerPage() {
		return updateCustomerPage;
	}

	public static StockPage getStockPage() {
		return stockPage;
	}

	public static CustomerStatsPage getCustomerStatsPage() {
		return customerStatsPage;
	}

	public static CustomerViewPage getCustomerViewPage() {
		return customerViewPage;
	}

	public static AddProductPage getAddProductPage() {
		return addProductPage;
	}

	public static ProductsPage getProductsPage() {
		return productsPage;
	}

	public static ProductStatsPage getProductStatsPage() {
		return productStatsPage;
	}

	public static ProductViewPage getProductViewPage() {
		return productViewPage;
	}

	public static UpdateProductPage getUpdateProductPage() {
		return updateProductPage;
	}
	
	
	
	
	
	
	
	
	
	

}
