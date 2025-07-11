@GetMapping("/availability")
public ResponseEntity<List<String>> getDoctorAvailability(
        @RequestHeader("Authorization") String token,
        @RequestParam("role") String role,
        @RequestParam("doctorId") Long doctorId,
        @RequestParam("date") String dateStr
) {
    LocalDate date = LocalDate.parse(dateStr);

    // Validate token and role (simplified logic)
    if (!doctorService.isAuthorized(token, role)) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    // Fetch availability
    List<String> availableSlots = doctorService.getAvailabilityByDoctorAndDate(doctorId, date);
    return ResponseEntity.ok(availableSlots);
}
