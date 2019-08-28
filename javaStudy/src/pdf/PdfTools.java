package pdf;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

/**
 * IText说明
 * 
 * iText 是 Lowagie.com 站点（请参阅 参考资料）免费提供的 Java 库。 iText 库的功能很强大，支持 HTML、RTF 和 XML
 * 文档的生成，此外还能够生成 PDF 文档。 可以从多种字体中选择文档中所使用的字体。 同时，iText 的结构允许使用相同的代码生成以上任意类型的文档。
 * http://itextpdf.com/官网 http://sourceforge.net/projects/itext/files/源码 iText
 * API： com.lowagie.text.Document 是生成 PDF
 * 的主要的类。它是需要使用的第一个类。一旦开始创建文档，将需要一个写入器向文档中写入内容。 com.lowagie.text.pdf.PdfWriter
 * 就是一个 PDF 写入器。下面列出了通常需要使用的类： com.lowagie.text.Paragraph —— 这个类表示一个缩进的段落。
 * com.lowagie.text.Chapter —— 这个类表示 PDF 文档中的章节。使用 Paragraph 作为题目并使用 int
 * 作为章节号码来创建它。 com.lowagie.text.Font ——
 * 这个类包含了全部的字体规范，例如字体、大小、样式和颜色。各种字体都在这个类中声明为静态常数。 com.lowagie.text.List ——
 * 这个类表示一个列表，按顺序包含许多 ListItems。 com.lowagie.text.Table ——
 * 这个类表示包含单元格的表，单元格有序地排列在矩阵中。
 */
public class PdfTools {
	/**
	 * 
	 * 生成PDF的方法
	 * 
	 * @return boolean
	 * 
	 */

	public static boolean createPDF(String pdfPath) {

		Document document = new Document();// 建立一个Document对象

		document.setPageSize(PageSize.A4);// 设置页面大小

		try {

			PdfWriter.getInstance(document, new FileOutputStream(pdfPath));// 建立一个PdfWriter对象
			document.open();
			BaseFont bfChinese = BaseFont.createFont("STSong-Light",
					"UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);// 设置中文字体
			Font titleFont = new Font(bfChinese, 15, Font.BOLD);// 设置字体大小
			Font headFont = new Font(bfChinese, 10, Font.BOLD);// 设置字体大小
			Font headFont1 = new Font(bfChinese, 10, Font.BOLD);// 设置字体大小
			Font headFont2 = new Font(bfChinese, 10, Font.NORMAL);// 设置字体大小

			document.add(new Paragraph("标题", titleFont));

			float[] widths = { 100f, 100f,100f,100f};// 设置表格的列宽

			PdfPTable table = new PdfPTable(widths);// 建立一个pdf表格

			table.setSpacingBefore(20f);// 设置表格上面空白宽度

			table.setTotalWidth(400);// 设置表格的宽度

			table.setLockedWidth(true);// 设置表格的宽度固定

			table.getDefaultCell().setBorder(1);// 设置表格默认为边框1

			
			PdfPCell cell = new PdfPCell(new Paragraph("Taony testPdf 中文字体",headFont));// 建立一个单元格

			// cell.setBorder(0);//设置单元格无边框

			//cell.setColspan(2);// 设置合并单元格的列数

			table.addCell(cell);// 增加单元格

			cell = new PdfPCell(new Paragraph("YU testPdf 中文字体", headFont));

			// cell.setBorder(0);

			cell.setFixedHeight(20);

			//cell.setColspan(2);// 设置合并单元格的列数

			cell.setHorizontalAlignment(Element.ALIGN_CENTER);// 设置内容水平居中显示

			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);

			table.addCell(cell);

			cell = new PdfPCell(new Paragraph("Taony125 testPdf 中文字体",
					headFont1));

			// cell.setBorder(0);

			cell.setFixedHeight(20);

			// cell.setColspan(7);// 设置合并单元格的列数

			cell.setHorizontalAlignment(Element.ALIGN_CENTER);// 设置内容水平居中显示

			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);

			table.addCell(cell);
			
			
			cell = new PdfPCell(new Paragraph("Taonycornyu testPdf ",
					headFont1));
			cell.setFixedHeight(20);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);// 设置内容水平居中显示
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			table.addCell(cell);
			
			
			
			

			table.addCell(new Paragraph("cornyu testPdf 中文字体", headFont2));

			document.add(table);

		} catch (DocumentException de) {

			System.err.println(de.getMessage());

			return false;

		}

		catch (IOException ioe) {

			System.err.println(ioe.getMessage());

			return false;

		}

		document.close();

		return true;

	}

	public static void creteTablePdf() throws DocumentException, IOException {
		// 生成PDF开始
		Document document = new Document(PageSize.A4, -10f, -10f, 144f, 56f);// 设置页大小A4，也边距（左右，上下）

		PdfWriter out = PdfWriter.getInstance(document, new FileOutputStream(
				"f:\\test4.pdf"));

		BaseFont bfChinese = BaseFont.createFont("STSong-Light",
				"UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);// 设置中文字体

		Font FontChinese = new Font(bfChinese, 12, Font.BOLD);

		BaseColor skyColor = new BaseColor(224, 234, 239);

		PdfPTable mainTable = new PdfPTable(1);// 大表格一列
		mainTable.setSplitLate(false);// 跨页处理
		mainTable.setSplitRows(true);

		PdfPCell cellMain = new PdfPCell(new Paragraph("偿还指数", FontChinese));// 第一列,创建单元格cell
		int positionLeft = 50;
		cellMain.setHorizontalAlignment(positionLeft);// 水平居右
		// cellMain.setBackgroundColor(skyColor);//单元格背景颜色，我设置的是 BaseColor
		// skyColor = new BaseColor(224, 234, 239); 背景颜色天蓝色
		cellMain.setBorderWidth(7f);// 边框7px
		cellMain.setFixedHeight(30);// 单元格高30px
		// cellMain.setBorderColor(skyColor);//边框颜色
		mainTable.addCell(cellMain);// 添加到table去，每创一个cell,都添加到table才有效。

		// 第二行
		// 偿还指数信息的cell-----begin------
		PdfPCell repayCell = new PdfPCell();
		repayCell.setBorderWidth(7f);
		// repayCell.setBorderColor(grayLableColor);
		repayCell.setPaddingLeft(-45f);
		repayCell.setPaddingTop(10f);
		repayCell.setPaddingBottom(10f);
		repayCell.setPaddingRight(-45f);
		// repayCell.setBackgroundColor(whiteColor);

		// 偿还指数信息的表格（嵌入表格）----begin---
		PdfPTable repayTable = new PdfPTable(4);// 一行四列(column,row);
		repayTable.setWidths(new float[] { 0.18f, 0.4f, 0.16f, 0.26f });// 每个单元格占多宽
		PdfPCell cell = new PdfPCell();// 创建单元格
		cell.setColspan(4);// 跨4列
		// 加载图片
		// Image image =
		// Image.getInstance(imagePath+"/images/pic/pic_"+isIndex(repayIndexInfo.getScore())+".jpg");
		// cell.setImage(image);
		// cell.setBorderColor(whiteColor);//设置背景颜色，我这里是白色 BaseColor whiteColor
		// = new BaseColor(255, 255, 255);
		repayTable.addCell(cell);// table加入单元格
		Font headFont = new Font(bfChinese, 10, Font.BOLD);// 设置字体大小
		cell = new PdfPCell(new Paragraph("企业偿还指数:", headFont));
		cell.setHorizontalAlignment(positionLeft);
		int positionTop = 50;
		cell.setVerticalAlignment(positionTop);// 垂直居上int positionTop =
												// Element.ALIGN_TOP;
		cell.setBorderWidth(1f);
		// cell.setBorderColor(whiteColor);
		cell.setFixedHeight(20);
		// cell.setBackgroundColor(grayLableColor);
		repayTable.addCell(cell);

		cell = new PdfPCell(new Paragraph("$ 700.00", headFont));
		cell.setHorizontalAlignment(positionLeft);
		cell.setBorderWidth(1f);
		// cell.setBorderColor(whiteColor);
		cell.setColspan(3);
		// cell.setBackgroundColor(grayContentColor);
		repayTable.addCell(cell);

		cell = new PdfPCell(new Paragraph("信用风险评级:", headFont));
		cell.setHorizontalAlignment(positionLeft);
		cell.setVerticalAlignment(positionTop);
		cell.setBorderWidth(1f);
		cell.setFixedHeight(20);
		// cell.setBorderColor(whiteColor);
		// cell.setBackgroundColor(grayLableColor);
		repayTable.addCell(cell);

		cell = new PdfPCell(new Paragraph("ceshi3", headFont));
		cell.setHorizontalAlignment(positionLeft);
		cell.setBorderWidth(1);
		// cell.setBorderColor(whiteColor);
		cell.setColspan(3);
		// cell.setBackgroundColor(grayContentColor);
		repayTable.addCell(cell);

		cell = new PdfPCell(new Paragraph("建议信用额度:", headFont));
		cell.setHorizontalAlignment(positionLeft);
		cell.setVerticalAlignment(positionTop);
		cell.setBorderWidth(1f);
		// cell.setBorderColor(whiteColor);
		cell.setFixedHeight(20);
		// cell.setBackgroundColor(grayLableColor);
		repayTable.addCell(cell);

		cell = new PdfPCell(new Paragraph("目前没有具体信用额度建议", headFont));
		cell.setHorizontalAlignment(positionLeft);
		cell.setBorderWidth(1);
		// cell.setBorderColor(whiteColor);
		cell.setColspan(3);
		// cell.setBackgroundColor(grayContentColor);
		repayTable.addCell(cell);

		cell = new PdfPCell(new Paragraph(
				"注释: 企业偿还指数是判断目标企业偿还付款能力的早期指针，指数越高，拖欠款风险可能越高。企业偿还指数从100分最好的评级",
				headFont));
		cell.setColspan(4);
		cell.setBorderWidth(1f);
		// cell.setBorderColor(whiteColor);
		cell.setFixedHeight(12);
		repayTable.addCell(cell);

		cell = new PdfPCell(new Paragraph("      到600分最高风险。", headFont));
		cell.setColspan(4);
		cell.setBorderWidth(1f);
		// cell.setBorderColor(whiteColor);
		cell.setFixedHeight(12);
		repayTable.addCell(cell);

		// 基本信息的表格-----end-----
		repayCell.addElement(repayTable);

		// 基本信息的单元格-----end-----
		mainTable.addCell(repayCell);// 把mainTable 第2行的单元格加进去

		document.add(mainTable);
		// 把table加入到document对象里
		document.close();

	}

	public static void main(String[] args) throws DocumentException, IOException {

		// TODO 自动生成方法存根

		PdfTools.createPDF("F:/test.pdf");

		//PdfTools.creteTablePdf();

	}

}