package controller;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import vo.ReportCommand;

@Controller
public class ReportSubmissionCintroller {
	@GetMapping("/report/submission.do")
	public String form() {
		return "report/submissionForm";
	}

	@PostMapping("/report/submitReport1.do")
	public String submitReport1(@RequestParam("studentNumber") String studentNumber,
			@RequestParam("report") MultipartFile report, HttpServletRequest request) {
		ServletContext context = request.getServletContext();
		String path = context.getRealPath("/fileSave");

		String filename = report.getOriginalFilename();
		// 처음에 사용자가 선택한 원래 이름.
		File file = new File(path + "/" + filename);
		try {
			report.transferTo(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		printInfo(studentNumber, report);

		return "report/submissionComplete";
	}

	private void printInfo(String studentNumber, MultipartFile report) {
		// TODO Auto-generated method stub
		System.out.println(studentNumber + "가 업로드한 파일 " + report.getOriginalFilename());
	}

	@PostMapping("/report/submitReport2.do")
	public String submitReport2(MultipartHttpServletRequest request) {
		String studentNumber = request.getParameter("studentNumber");
		MultipartFile report = request.getFile("report");

		printInfo(studentNumber, report);

		return "report/submissionComplete";
	}
	
	@PostMapping("/report/submitReport3.do")
	public String submitReport3(ReportCommand reportCommand) {
		printInfo(reportCommand.getStudentNumber(), reportCommand.getReport());
		return "report/submissionComplete";
	}
}