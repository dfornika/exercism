use chrono::{DateTime, Utc, TimeZone};

// Returns a Utc DateTime one billion seconds after start.
pub fn after(start: DateTime<Utc>) -> DateTime<Utc> {
    Utc.timestamp(start.timestamp() + 1_000_000_000, 0u32)
}
